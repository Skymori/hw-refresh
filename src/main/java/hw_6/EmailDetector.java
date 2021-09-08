package hw_6;

public class EmailDetector {
    public boolean isPresent(String text){
        String isEmail = text.replaceAll("\\w{2}@\\w{2}", "");
        if (text.length() - isEmail.length() == 5){
            return true;
        }else {
            return false;
        }
    }
}
