package hw_6;

public class WordFreqCounter {
    public float countFreq(String phrase, String word){
        String [] words = phrase.split(" ");
        float count = 0;
        for (String w : words){
            if (word.equalsIgnoreCase(w)){
                count++;
            }
        }return count / words.length;
    }
}
