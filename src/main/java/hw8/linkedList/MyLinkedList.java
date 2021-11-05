package hw8.linkedList;

import java.util.Objects;
import java.util.StringJoiner;

public class MyLinkedList<E> {
    private MyNode<E> firstNode;
    private MyNode<E> lastNode;
    private int size = 0;

    public static class MyNode<E> {
        MyNode<E> prev;
        E element;
        MyNode<E> next;

        public MyNode(MyNode<E> prev, E element, MyNode<E> next) {
            this.prev = prev;
            this.element = element;
            this.next = next;
        }
    }

    public MyLinkedList() {
    }

    public void addLastElement(E e) {
        MyNode<E> addNode = lastNode;
        MyNode<E> newElement = new MyNode<>(addNode, e, null);
        lastNode = newElement;
        if (addNode == null) {
            firstNode = newElement;
        } else addNode.next = newElement;
        size++;
    }

    public boolean add(E e) {
        addLastElement(e);
        return true;
    }

    public void remove(int index) {
        MyNode<E> node = get(index);
        if (node.prev == null) firstNode = node.next;
        else node.prev.next = node.next;
        if (node.next == null) lastNode = node.prev;
        else node.next.prev = node.next;
        size--;

    }

    public void clear() {
        firstNode = null;
        lastNode = null;
        size = 0;
    }

    public MyNode<E> get(int index) {
        Objects.checkIndex(index, size);
        MyNode<E> node = firstNode;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }


    @Override
    public String toString() {
        String beginning = "MyLinkedList: " + "size=" + size + ", [";
        StringJoiner joiner = new StringJoiner(", ", beginning, "]");
        for (int i = 0; i < size; i++) {
            joiner.add("" + get(i));
        }

        return joiner.toString();
    }
}
