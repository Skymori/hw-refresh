package hw10.task4;

import java.util.stream.Stream;

public class Task4 {
    public static Stream<Long> getRandom(long a, long c, long m, long seed) {
        if (check(a, c, m, seed)){
            return Stream.iterate(seed, aLong -> (a * aLong + c) % m);
        }else {
            throw new RuntimeException("Invalid parameters");
        }
    }

    public static boolean check(long a, long c, long m, long seed) {
        return (m >= 2
                && a >= 0 && a < m
                && c >= 0 && c < m
                && seed>= 0 && seed<m);
    }
}
