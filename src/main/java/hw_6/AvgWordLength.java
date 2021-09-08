package hw_6;

public class AvgWordLength {
    public double count(String phrase){
        float countChar = 0;
        String [] phraseWord = phrase.split(" ");
        for (int i = 0; i < phraseWord.length; i++) {
        countChar += phraseWord[i].length();
        }return countChar / phraseWord.length;
    }
}
