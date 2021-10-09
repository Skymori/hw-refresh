package hw6;

public class ShortWordCounter {
    public int count(String phrase, int minLength){
        int cont = 0;
        String [] words = phrase.split(" ");
        for (String word : words){
            if (word.length() <= minLength){
                cont++;
            }
        }return cont;
    }
}
