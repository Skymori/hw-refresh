package hw8.linkedList;

public class Main {

    public static void main(String[] args) {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        System.out.println(myLinkedList);
        myLinkedList.remove(1);
        System.out.println(myLinkedList);

        System.out.println(myLinkedList.get(0).element);
        myLinkedList.clear();
        System.out.println(myLinkedList);

    }
}
