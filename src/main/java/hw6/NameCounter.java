package hw6;

public class NameCounter {
    public int count(String text){
        int count = 0;
        String [] words = text.split(" ");
        for (String word : words) {
            if(word.length() >= 2) {
                char[] chars = word.toCharArray();
                boolean restCharsAreSmall = false;
                if(Character.isUpperCase(chars[0])){
                    for (int i = 1; i < chars.length; i++) {

                        char c = chars[i];
                        if(Character.isLowerCase(c)) {
                            restCharsAreSmall = true;
                        }else{
                            restCharsAreSmall = false;
                            break;
                        }
                    }
                    if(restCharsAreSmall){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
