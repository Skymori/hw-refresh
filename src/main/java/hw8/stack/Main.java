package hw8.stack;

public class Main {
    public static void main(String[] args) {
        MyStack<Integer> myStack = new MyStack<>();
        myStack.push(2);
        myStack.push(3);
        System.out.println(myStack.size());
        System.out.println(myStack);
        System.out.println(myStack.peek());
        System.out.println(myStack.pop());
        System.out.println(myStack);
        myStack.clear();
        System.out.println(myStack);
    }
}
