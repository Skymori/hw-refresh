package hw8.stack;

public class MyStack <E>{
    private MyNode<E> firstNode;
    private MyNode<E> lastNode;
    private int size;
    private static class MyNode<E>{
        MyNode<E> prev;
        E element;
        MyNode<E> next;

        public MyNode(MyNode<E> prev, E element, MyNode<E> next) {
            this.prev = prev;
            this.element = element;
            this.next = next;
        }
    }
    public void push(E element){
        MyNode<E> node = lastNode;
        MyNode<E> newNode = new MyNode<E>(node,element,null);
        lastNode = newNode;
        if (node == null){
            firstNode = newNode;
        }else {
            node.next=(newNode);
        }
        size++;
    }
    public void remove(int index){
        MyNode<E> node;
        if (index < 0 || index>=size) throw new IndexOutOfBoundsException();
        node = firstNode;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        if (node.prev == null) firstNode = node.next;
        else node.prev.next = node.next;
        if (node.next == null) lastNode = node.prev;
        else node.next.prev = node.prev;
        size--;
    }
    public void clear(){
        firstNode = null;
        lastNode = null;
        size = 0;
    }
    public int size(){
        return size;
    }
    public E peek(){
        return lastNode.element;
    }
    public E pop(){
        E elementPop = peek();
        remove(size-1);
        return elementPop;
    }

    @Override
    public String toString() {
        return "MyStack{" +
                "first=" + firstNode +
                ", last=" + lastNode +
                ", size=" + size +
                '}';
    }
}
