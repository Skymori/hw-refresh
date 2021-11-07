package hw10.task5;

import java.util.Collections;
import java.util.Iterator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Task5 {
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Iterator<T> secondIterator = second.iterator();
        Stream.Builder<T> builder = Stream.builder();
        first.forEach((e -> {
            if (secondIterator.hasNext()) {
                builder.accept(e);
                builder.accept(secondIterator.next());
            } else {
                first.close();
            }
        }));
        return builder.build().collect(Collectors.collectingAndThen(
                toList(),
                list -> {
                    Collections.shuffle(list);
                    return list.stream();
                }));
    }

}
