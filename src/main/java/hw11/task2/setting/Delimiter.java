package hw11.task2.setting;

import java.util.Arrays;

import static hw11.task2.threds.Buzz.buzz;
import static hw11.task2.threds.Fizz.fizz;
import static hw11.task2.threds.FizzBuzz.fizzBuzz;
import static hw11.task2.threds.Number.number;

public class Delimiter {
    public static String myDelimiter(int n){
        int[] ints = new int[n];
        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            ints[i]= i+1;
        }
        Thread fizz = new Thread(() -> fizz(ints,strings));
        fizz.start();
        Thread buzz = new Thread(()-> buzz(ints,strings));
        buzz.start();
        Thread fizzBuzz = new Thread(()-> fizzBuzz(ints,strings));
        fizzBuzz.start();
        Thread number = new Thread(()-> number(ints,strings));
        number.start();
        while (!Terminated.terminatedThread(fizz,buzz,fizzBuzz,number)){
            Sleep.sleep();
        }
    return String.join(", ", Arrays.asList(strings));
    }

}
