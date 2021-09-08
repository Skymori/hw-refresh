package hw_3;

import java.util.Scanner;

public class MoonComputerTests {
    public void testBasicInputOutput() {
        Scanner scanner = new Scanner(System.in);
        String st = scanner.nextLine();
        System.out.println(st);
        scanner.close();
    }
    public void testMath(){
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        scanner.close();
        System.out.println(first+second
                +" "+
                (first - second)
                +" "+
                (first * second)
                +" "+
                (first/second));
    }
    public void testLogicalOperators(){
        Scanner scanner = new Scanner(System.in);
        boolean first = scanner.nextBoolean();
        boolean second = scanner.nextBoolean();
        boolean three = scanner.nextBoolean();
        scanner.close();
        System.out.println((first && second && three)
                +" "+(first || second || three));
    }
    //Test output on Hello Java standard input
    public static void main(String[] args) {
        MoonComputerTests computerTests = new MoonComputerTests();
        computerTests.testBasicInputOutput();
    }
}
