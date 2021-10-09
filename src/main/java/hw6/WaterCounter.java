package hw6;

public class WaterCounter {
    public double count(String text){
        double count = 0;
        char[] ch = text.toCharArray();
        for (char c : ch){
            if (c == ' '){
                count++;
            }
        }return ch.length / count;
    }
}

