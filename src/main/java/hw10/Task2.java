package hw10;


import hw10.resources.User;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    public static List<User> getUser() {
        return List.of(new User(1, "Eric", "Cantona", 31),
                new User(2, "David", "Beckham", 28),
                new User(3, "Luis", "Suares", 33),
                new User(4, "Zinedine", "Zidane", 28),
                new User(5, "Cristiano", "Ronaldo", 31),
                new User(6, "Zlatan", "Ibrahimovich", 31),
                new User(7, "Ronaldinho", "Gaucho", 33));
    }

    public static void main(String[] args) {
        List<String> stringList = getUser().stream()
                .map(User::getFirstName)
                .map(String::toUpperCase)
                .sorted(Comparator.comparing(String::toString).reversed())
                .collect(Collectors.toList());
        System.out.println(stringList);
    }

}
