package hw6;

public class WordCombine {
    public boolean canCombine(String sourceWord, String targetWord){
        boolean canCombine = false;
        for (int i = 0; i < targetWord.length(); i++) {
        if (sourceWord.toLowerCase().contains(targetWord.toLowerCase().substring(i,i+1))){
            canCombine = true;
        }else {
            return canCombine = false;
        }
        }return canCombine;
    }
}
class WordCombineTest {
    public static void main(String[] args) {
        //true
        System.out.println(new WordCombine().canCombine("Forest", "tor"));

        //true
        System.out.println(new WordCombine().canCombine("Magic", "Mama"));

        //false
        System.out.println(new WordCombine().canCombine("War", "Piece"));
    }
}