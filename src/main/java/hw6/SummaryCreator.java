package hw6;

public class SummaryCreator {
    public String create(String text){
        if(text.length() <= 15){
            return text;
        }else {
            if (text.substring(15,16).equals(" ")){
                return text.substring(0,15);
            }else {
                return text.substring(0,15)+ "...";
            }
        }
    }
}
