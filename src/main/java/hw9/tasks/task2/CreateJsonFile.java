package hw9.tasks.task2;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class CreateJsonFile {
    public static void crateJsonFormat(String pathToStartFile, String pathToJsonFile){
        File file = new File(pathToStartFile);
        List<User> users = new ArrayList<>();
        if (!ExtractedFile.extractedFileToList(file,users))return;
        if (users.size()!=0){
            ConvertFile.convertToJson(pathToJsonFile,file,users);
        }
    }
}
