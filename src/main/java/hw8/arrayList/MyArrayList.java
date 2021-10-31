package hw8.arrayList;

import java.util.Arrays;
import java.util.Objects;

public class MyArrayList<E> {
    private E[] array;
    private int sizeE;

    public MyArrayList(E[] array) {
        this.array = array;
        sizeE = 0;
    }

    public MyArrayList() {
        this(10);
    }

    public MyArrayList(int capacity) {
        this.array = (E[]) new Object[capacity];
        sizeE = 0;
    }

    public boolean add(E e) {
        if (sizeE == array.length) {
            Object[] newArray = new Object[array.length * 3 / 2 + 1];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = (E[]) newArray;
        }
        array[sizeE++] = e;
        return true;
    }

    public E get(int index) {
        return array[index];
    }

    public int size() {
        return sizeE;
    }

    public E remove(int index) {
        Objects.checkIndex(index, sizeE);
        E element = array[index];
        array[index] = null;
        for (int i = index; i < sizeE; i++) {
            array[i] = array[i + 1];
        }
        sizeE--;
        return element;
    }

    public void clear() {
        sizeE = 0;
        array = (E[]) new Object[10];

    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "array=" + Arrays.toString(array) +
                ", size=" + sizeE +
                '}';
    }

}
