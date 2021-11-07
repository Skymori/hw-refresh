package wq10;

import java.util.List;
import java.util.stream.Collectors;

public class Q8 {
    public static void main(String[] args) {
        List<String> stringList = getStudents().stream()
                .map(student -> "\n Hello" + student.getFirstName() + " " + student.getLastName())
                .collect(Collectors.toList());
        System.out.println(stringList);
    }
    public static List<Student> getStudents() {
        return List.of(new Student(1, "Eric", "Cantona", 31),
                new Student(2, "David", "Beckham", 28),
                new Student(3, "Luis", "Suares", 33),
                new Student(4, "Zinedine", "Zidane", 28),
                new Student(4, "Cristiano", "Ronaldo", 31),
                new Student(4, "Ronaldinho", "Gaucho", 33));
    }
}
