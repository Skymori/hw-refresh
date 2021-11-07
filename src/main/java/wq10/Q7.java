package wq10;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Q7 {
    public static void main(String[] args) {
        List<Student> studentList = getStudents().stream()
                .filter(Objects::nonNull)
                .sorted(Comparator.comparing(Student::getFirstName).thenComparing(Student::getLastName))
                .collect(Collectors.toList());
        System.out.println(studentList);
    }
    public static List<Student> getStudents() {
        return Arrays.asList(new Student(1, "Eric", "Cantona", 31),
                new Student(2, "David", "Beckham", 28),
                new Student(3, "Luis", "Suares", 33),
                new Student(4, "Zinedine", "Zidane", 28),
                new Student(5, "Cristiano", "Ronaldo", 31),
                null,
                new Student(6, "Zlatan", "Ibrahimovich", 31),
                new Student(7, "Ronaldinho", "Gaucho", 33));
    }
}
