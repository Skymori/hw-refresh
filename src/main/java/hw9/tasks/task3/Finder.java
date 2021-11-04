package hw9.tasks.task3;

import java.io.File;
import java.util.List;
import java.util.Map;

public class Finder {
    public static void findFrequencyInFile(String path) {
        File file = new File(path);
        StringBuilder stringBuilder = new StringBuilder();
        if (file.exists() && file.isFile()) {
            String[] parts = Reader.readTextFile(file, stringBuilder);
            List<Map.Entry<String, Integer>> entryList = Creator.createWordToArray(parts);
            entryList.forEach(entry -> System.out.println(entry.getKey()+" "+entry.getValue()));
        }
        else {
            System.out.println("Error file");
        }
    }
}
