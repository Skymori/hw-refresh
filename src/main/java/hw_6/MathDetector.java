package hw_6;

public class MathDetector {
    public boolean isMath(String text){
    boolean containsEquals = text.contains("=");
    boolean containsMathSign = text.contains("+")
            || text.contains("-")
            || text.contains("*")
            || text.contains("/");
    String digitReplace = text.replaceAll("[0-9]", "");
    boolean containsDigit = text.length() - digitReplace.length() >= 2;
    if (containsDigit && containsEquals && containsMathSign){
        return true;
        }else {
        return false;
        }
    }
}
