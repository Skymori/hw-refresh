package hw_6;

public class BigOrSmall {
    public String calculate(String text){
        char [] ch = text.toCharArray();
        int bigCount = 0;
        int smallCount = 0;
        for (char c : ch){
            if (c == ' ') continue;
            if (Character.isUpperCase(c)){
                bigCount++;
            }else if (Character.isLowerCase(c)){
                smallCount++;
            }
        }
        if (bigCount > smallCount){
            return "Big";
        }else if (bigCount < smallCount){
            return "Small";
        }else {
            return "Same";
        }
    }
}
