package hw_6;

public class WordDeleter {
    public String remove(String phrase, String[] words) {
        String[] parts = phrase.split(" ");
        for (int i = 0; i < parts.length; i++) {
            for (String st : words){
                if (parts[i] != null && parts[i].equals(st)){
                    parts[i] = null;
                }
            }
        }
        String returnString = "";
        for (String part : parts){
            if (part != null){
                returnString = returnString+ " " + part;
            }
        }return returnString.strip();
    }
}
