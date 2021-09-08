package hw_3h;

import java.util.Arrays;
import java.util.Scanner;

public class Greed {
    public static void main(String[] args) {
        int [] cube = new int[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("enter number 1-6");
            cube[i] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(cube));

    }

}
