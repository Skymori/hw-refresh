package hw6;

public class GooQuery {
    private String language;
    private String text;

    public GooQuery(String language, String text) {
        this.language = language;
        this.text = text;
    }

    public String getLanguage() {
        return language;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "Searching ["+text+"], using language: "+language;
    }
}
