package hw_6;

public class SensitiveDataSearcher {
    public boolean isSensitiveDataPresent(String phrase){
        String [] sensitiveWord = new String[]{"pass", "key", "login", "email"};
        boolean isSensitive = false;
        for (String word : sensitiveWord){
            if (phrase.toLowerCase().contains(word)){
                isSensitive = true;
            }
        }return isSensitive;
    }
}
