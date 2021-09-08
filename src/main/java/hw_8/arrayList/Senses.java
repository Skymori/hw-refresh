package hw_8.arrayList;

import java.util.Arrays;
import java.util.Scanner;

public class Senses {
    public static void main(String[] args) {
        System.out.println("Введите строку:");
        Scanner scanner = new Scanner(System.in);
        char[] chars = scanner.nextLine().toCharArray();
        int coincidence = countWordMatches(chars);
        if (coincidence == 1) {
            System.out.println("\"" + Arrays.toString(chars) + "\" == " + "1 feeling");
        } else {
            System.out.println("\"" + Arrays.toString(chars) + "\" == " + coincidence + " feelings");
        }
    }
    private static int countWordMatches(char[] chars) {
        String[] str = {"grief", "awe", "joy", "love", "anger"};
        int count = 0;
        for (String s : str) {
            boolean b = rez(s, chars);
            if (b == true) {
                count++;
            }
        }
        return count;
    }
    private static boolean rez(String str, char[] chars) {
        char[] anger = str.toCharArray();
        char[] fromConsole = Arrays.copyOf(chars, chars.length);
        int length = anger.length;
        int count = 0;
        for (char c : anger) {
            for (int j = 0; j < fromConsole.length; j++) {
                if (c == fromConsole[j]) {
                    count++;
                    fromConsole[j] = '\u0000';
                    break;
                }
            }
        }
        return count == length;
    }
}

