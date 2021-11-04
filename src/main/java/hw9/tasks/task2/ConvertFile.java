package hw9.tasks.task2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ConvertFile {
    public static void convertToJson(String pathToJson, File file, List<User> users) {
        File fileJson = new File(pathToJson);
        if (!file.exists()) {
            file.getParentFile().mkdirs();
        }
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileJson))) {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String json = gson.toJson(users);
            bufferedWriter.write(json);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
