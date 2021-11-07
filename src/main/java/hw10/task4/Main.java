package hw10.task4;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Long> longList = Task4.getRandom(25214903917L, 11L, (long) Math.pow(2, 48), 14)
                .limit(30)
                .collect(Collectors.toList());
        System.out.println(longList);
    }
}
