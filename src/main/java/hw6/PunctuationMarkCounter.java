package hw6;

public class PunctuationMarkCounter {
    public int count(String phrase){
        char [] charsArray = phrase.toCharArray();
        int count = 0;
        for (char ch : charsArray){
            if (ch == '.'|| ch == ',' || ch =='!' || ch ==':' || ch == ';'){
                count++;
            }
        }return count;
    }
}
