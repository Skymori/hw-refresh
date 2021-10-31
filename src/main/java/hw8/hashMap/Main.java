package hw8.hashMap;

public class Main {
    public static void main(String[] args) {
        MyHashMap<Integer, String> myHashMap = new MyHashMap<>();
        myHashMap.put(0,"zero");
        myHashMap.put(1,"one");
        myHashMap.put(2,"two");
        System.out.println(myHashMap.size());
        myHashMap.remove(1);
        System.out.println(myHashMap.get(2));
        myHashMap.clear();
        System.out.println(myHashMap.size());

    }
}
