package hw8.queue;

import java.util.Arrays;
import java.util.Objects;

public class MyQueue<Q> {
    private static final int DEFAULT_CAPACITY = 10;
    private Q[] data;
    private int size;

    public MyQueue() {
        this.data = (Q[]) new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }

    private void resize() {
        data = (Q[]) Arrays.copyOf(data, (size * 3 / 2 + 1));
    }

    public boolean add(Q element) {
        if (element == null)
            throw new NullPointerException();
        if (size == data.length) {
            resize();
        }
        data[size] = element;
        size++;
        return true;
    }

    public Q remove(int index) {
        Objects.checkIndex(index, size);
        Q element = data[index];
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
    public Q peek(){
        return data[0];
    }
    public Q pool(){
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
