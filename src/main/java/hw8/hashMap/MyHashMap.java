package hw8.hashMap;

import java.util.Objects;

public class MyHashMap<K, V> {
    private MyNode<K, V>[] hashArray;
    private final int DEFAULT_CAPACITY = 16;
    private int size;

    public MyHashMap() {
        this.hashArray = new MyNode[DEFAULT_CAPACITY];
        this.size = 0;
    }

    private static class MyNode<K, V> {
        K key;
        V value;
        int hash;
        MyNode<K, V> next;

        public MyNode(K key, V value) {
            this.key = key;
            this.value = value;
            this.hash = getHash(key);
        }

        final int getHash(K key) {
            int hash;
            return (key == null) ? 0 : (hash = key.hashCode()) ^ (hash >>> 16);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof MyNode)) return false;
            MyNode<K, V> myNode = (MyNode<K, V>) o;
            return hash == myNode.hash && Objects.equals(key, myNode.key);
        }

        @Override
        public String toString() {
            return "MyNode{" +
                    "key=" + key +
                    ", value=" + value +
                    '}';
        }
    }

    private int indexOf(K key) {
        return hashArray.length - 1 & key.hashCode();
    }

    private void resize() {
        MyNode<K, V>[] newArray = new MyNode[hashArray.length + hashArray.length / 3 * 2 + 1];
        System.arraycopy(hashArray, 0, newArray, 0, hashArray.length);
        hashArray = newArray;
    }

    public boolean put(K key, V value) {
        boolean match = false;
        MyNode<K, V> node;
        MyNode<K, V> newNode = new MyNode<>(key, value);
        int index = indexOf(newNode.key);
        if (index > hashArray.length - 1) this.resize();
        if (hashArray[index] == null) {
            hashArray[index] = newNode;
            size++;
            return true;
        } else {
            node = hashArray[index];
            do {
                if (node.equals(newNode)) {
                    node.value = newNode.value;
                    match = true;
                }
            } while ((node.next) != null);
            if (!match) {
                node.next = newNode;
                size++;
            }
        }
        return true;
    }

    public void remove(K key) {
        int index = indexOf(key);
        MyNode<K, V> node;
        if (hashArray[index].next == null) hashArray[index] = null;
        else {
            node = hashArray[index];
            do {
                if (Objects.equals(node.next.key, key)) {
                    node.next = null;
                }
            } while ((node = node.next) != null);
        }
        --size;
    }

    public void clear() {
        hashArray = new MyNode[DEFAULT_CAPACITY];
        size = 0;
    }

    public int size() {
        return size;
    }

    public MyNode<K,V> get(K key){
        int index = indexOf(key);
        MyNode<K,V> node, getValue = null;
        if (hashArray[index].next == null) getValue = hashArray[index];
        else {
            node = hashArray[index].next;
            do {
                if (Objects.equals(node.key,key)) getValue = node;
            }while ((node = node.next)!= null);
        }
        return getValue;
    }

}
