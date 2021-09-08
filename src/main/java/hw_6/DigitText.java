package hw_6;

public class DigitText {
    public boolean detect(String text){
        String cleanText = text.replaceAll("\\d", "").replace(" ", "");
        if (cleanText.isBlank()){
            return true;
        }else {
            return false;
        }
    }
}
