package hw11.task2.threds;

public class Fizz {
    public static void fizz(int[] ints, String[] strings) {
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 3 == 0 & ints[i] % 5 != 0) {
                strings[i] = "fizz";
            }
        }
    }
}
