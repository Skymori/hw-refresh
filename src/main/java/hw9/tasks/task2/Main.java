package hw9.tasks.task2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static final String PATH_TASK2 = "src/main/java/hw9/resources/file2/file.txt";
    public static final String PATH_TASK2JSON = "src/main/java/hw9/resources/file2/user.json";

    public static void main(String[] args) {
        CreateJsonFile.crateJsonFormat(PATH_TASK2,PATH_TASK2JSON);
        try             (BufferedReader bufferedReader = new BufferedReader(new FileReader(PATH_TASK2JSON)))
        {
            String st;
            while ((st = bufferedReader.readLine())!= null){
                System.out.println(st);
            }
        }catch (IOException e){
            System.err.println(e.getMessage());
        }
    }

}
