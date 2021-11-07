package wq10;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Q2 {
    public static void main(String[] args) {
        List<Student> list = getStudents().stream()
                .filter(student -> student.getAge() > 30)
                .sorted(Comparator.comparing(Student::getLastName).reversed())
                .collect(Collectors.toList());
        System.out.println(list);
    }

    public static List<Student> getStudents() {
        return List.of(new Student(1, "Eric", "Cantona", 31),
                new Student(2, "David", "Beckham", 28),
                new Student(3, "Luis", "Suares", 33),
                new Student(4, "Zinedine", "Zidane", 33));
    }
}
