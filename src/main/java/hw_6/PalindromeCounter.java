package hw_6;

public class PalindromeCounter {
    public int count(String phrase){
        int cont = 0;
        String [] words = phrase.split(" ");
        for (String word : words){
            String revers = new StringBuilder(word).reverse().toString();
            if (word.equalsIgnoreCase(revers)){
                cont++;
            }
        }return cont;
    }
}
