package hw6;

public class DoubleSpaceCleaner {
    public String clean(String phrase){
        return phrase.replaceAll("( )+", " ").trim();
    }
}
