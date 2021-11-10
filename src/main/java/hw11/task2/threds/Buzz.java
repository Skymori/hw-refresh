package hw11.task2.threds;

public class Buzz {
    public static void buzz(int[] ints, String[] strings){
        for (int i = 0; i < ints.length; i++) {
            if ( ints[i] %5 == 0 & ints[i] % 3!=0){
                strings[i] = "buzz";
            }
        }
    }
}
