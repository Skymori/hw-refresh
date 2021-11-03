package hw8.queue;

import java.util.Arrays;
import java.util.Objects;

public class MyQueue<E> {
    private static final int DEFAULT_CAPACITY = 4;
    private E[] data;
    private int size;

    public MyQueue() {
        this.data = (E[]) new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }


    public boolean add(E element) {
        if (size < data.length) {
            data[size] = element;
            size++;
            return true;
        } else {
            throw new IllegalStateException();
        }
    }

    public E remove(int index) {
        Objects.checkIndex(index, size);
        E element = data[index];
        data[index] = null;
        for (int i = index; i < size; i++) {
            data[i] = data[i + 1];
        }
        size--;
        return element;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            data[i] = null;
        }
        size = 0;
    }

    public E peek() {
        return data[0];
    }

    public E pool() {
        return remove(0);
    }

    @Override
    public String toString() {
        return "MyQueue{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }
}
