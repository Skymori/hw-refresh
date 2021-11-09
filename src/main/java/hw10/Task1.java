package hw10;

import hw10.resources.User;

import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
    public static List<User> getUser() {
        return List.of(new User(1, "Eric", "Cantona", 31),
                new User(2, "David", "Beckham", 28),
                new User(3, "Luis", "Suares", 33),
                new User(4, "Zinedine", "Zidane", 33));
    }

    public static void main(String[] args) {
        String userStream = getUser().stream()
                .filter(index -> index.getId() % 2 != 0)
                .map(users -> users.getId() + " " + users.getFirstName())
                .collect(Collectors.joining(", "));
        System.out.println(userStream);
    }
}
