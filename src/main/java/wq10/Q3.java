package wq10;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Q3 {
    public static void main(String[] args) {
        Map<Integer,List<Student>> students =getStudents().stream()
                .collect(Collectors.groupingBy(Student::getAge));
        for (Map.Entry<Integer,List<Student>> values : students.entrySet()){
            System.out.println("key "+ values.getKey()+" count "+values.getValue());
        }
    }

    public static List<Student> getStudents() {
        return List.of(new Student(1, "Eric", "Cantona", 31),
                new Student(2, "David", "Beckham", 28),
                new Student(3, "Luis", "Suares", 33),
                new Student(4, "Zinedine", "Zidane", 28),
                new Student(4, "Zinedine", "Zidane", 31),
                new Student(4, "Zinedine", "Zidane", 33));
    }
}
