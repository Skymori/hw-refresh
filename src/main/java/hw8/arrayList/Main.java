package hw8.arrayList;

public class Main {
    public static void main(String[] args) {

        MyArrayList<Integer> arr = new MyArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        System.out.println(arr);
        System.out.println(arr.get(2));
        System.out.println(arr.size());
        System.out.println("--------------");
        arr.remove(2);
        System.out.println(arr);
        arr.clear();
        System.out.println(arr);
    }
}
