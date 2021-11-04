package hw8.queue;

public class Main {
    public static void main(String[] args) {

        MyQueue<Integer> myQueue = new MyQueue<>();
        myQueue.add(1);
        myQueue.add(2);
        myQueue.add(3);

        System.out.println(myQueue);

        myQueue.peek();
        myQueue.poll();
        System.out.println(myQueue);
        myQueue.clear();
        System.out.println(myQueue);
        myQueue.poll();
        System.out.println(myQueue);
    }
}
