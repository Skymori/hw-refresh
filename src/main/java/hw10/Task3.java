package hw10;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
    String[] strings = {"1, 2, 0", "4, 5"};

        String collect = Arrays.stream(strings)
                .flatMap(s -> Arrays.stream(s.split(", ")))
                .sorted(Comparator.comparingInt(Integer::parseInt))
                .collect(Collectors.joining(", "));
        System.out.println(collect);

    }
}
