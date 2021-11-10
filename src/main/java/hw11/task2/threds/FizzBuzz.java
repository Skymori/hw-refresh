package hw11.task2.threds;

public class FizzBuzz {
    public static void fizzBuzz(int[] ints, String[] strings) {
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 3==0 & ints[i] % 5 == 0) {
                strings[i] = "fizzbuzz";
            }
        }
    }
}
