package hw9.tasks.task1;

import java.io.*;
import java.util.regex.Pattern;

public class Validation {
    public static void ValidPhone(String path) {
        File file = new File(path);
        String validation1 = "^\\(\\d{3}\\)\\s\\d{3}-\\d{4}$";
        String validation2 = "^\\d{3}-\\d{3}-\\d{4}$";
        if (file.exists() && file.isFile()) {
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = bufferedReader.readLine()) != null){
                    if (Pattern.matches(validation1,line)|| Pattern.matches(validation2,line)){
                        System.out.println(line);
                    }
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
