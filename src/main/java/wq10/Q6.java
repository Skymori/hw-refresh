package wq10;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Q6 {
    public static void main(String[] args) {
        Map<Integer, String> stringMap = getStudents().stream()
                .collect(Collectors
                        .groupingBy(Student::getId, Collectors
                                .mapping(student -> student.getFirstName() + " " + student.getLastName(), Collectors.joining(","))));

        System.out.println(stringMap);
    }
    public static List<Student> getStudents() {
        return List.of(new Student(1, "Eric", "Cantona", 31),
                new Student(2, "David", "Beckham", 28),
                new Student(3, "Luis", "Suares", 33),
                new Student(3, "Zinedine", "Zidane", 28),
                new Student(4, "Cristiano", "Ronaldo", 31),
                new Student(4, "Ronaldinho", "Gaucho", 33));
    }
}
