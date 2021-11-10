package hw11.task2.threds;

public class Number {
    public static void number(int[] ints,String[] strings){
        for (int i = 0; i < ints.length; i++) {
            if (strings[i] == null){
                strings[i] = String.valueOf(ints[i]);
            }
        }
    }
}
