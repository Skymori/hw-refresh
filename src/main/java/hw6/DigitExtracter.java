package hw6;

public class DigitExtracter {
    public int[] extract(String text){
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (isDigit(text.substring(i, i+1))){
                count++;
            }
        }
        int [] digits = new int[count];
        count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (isDigit(text.substring(i,i+1))){
                digits[count] = Integer.parseInt(text.substring(i,i+1));
                count++;
            }
        }return digits;
    }
    private boolean isDigit(String st){
        try {
            Integer.parseInt(st);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
