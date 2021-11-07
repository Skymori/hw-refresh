package hw10.task5;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static hw10.task5.Task5.zip;

public class Main {
    public static void main(String[] args) {
        List<Integer> integerList = zip(IntStream.range(25, 34).boxed(),
                IntStream.range(22, 32).boxed())
                .collect(Collectors.toList());
        System.out.println(integerList);
    }
}
