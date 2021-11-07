package wq10;

import java.util.List;
import java.util.stream.Collectors;

public class Q5 {
    public static void main(String[] args) {
        List<Integer> integers = getList().stream()
                .map(Integer::parseInt)
                .filter(integer -> integer >= 10)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(integers);
    }
    public static List<String> getList() {
        return List.of("1", "10", "33", "8", "15", "0", "11", "-2");
    }
}
