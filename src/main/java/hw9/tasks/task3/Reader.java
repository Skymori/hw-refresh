package hw9.tasks.task3;

import java.io.*;

public class Reader {
    public static String[] readTextFile(File file, StringBuilder stringBuilder) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String st;
            while ((st = bufferedReader.readLine()) != null){
                stringBuilder.append(st.strip());
                stringBuilder.append(" ");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        String text = stringBuilder.toString();
        text = text.replaceAll("\\s+", " ");
        return text.split(" ");
    }
}
