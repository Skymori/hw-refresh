package hw9.tasks.task2;

import java.io.*;
import java.util.List;

public class ExtractedFile {
    public static boolean extractedFileToList(File file, List<User> users) {
        if (file.exists() && file.isFile()) {
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    String[] parts = line.strip().split(" ");
                    if (!parts[0].equals("name") && !parts[1].equals("age"))
                        users.add(new User(parts[0], Integer.parseInt(parts[1])));
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }else {
            System.out.println("Invalid path to file");
            return false;
        }
        return true;
    }
}
