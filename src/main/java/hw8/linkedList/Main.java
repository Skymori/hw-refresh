package hw8.linkedList;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        System.out.println(myLinkedList);
        myLinkedList.remove(1);
        System.out.println(myLinkedList);
        System.out.println(myLinkedList.get(1));
        myLinkedList.clear();
        System.out.println(myLinkedList);

    }
}
