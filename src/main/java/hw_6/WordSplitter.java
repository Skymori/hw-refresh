package hw_6;

public class WordSplitter {
    public String[] split(String phrase){
        String newPhrase = phrase.toLowerCase();
        return newPhrase.split("\\s+");
    }
}
