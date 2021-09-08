package hw_6;

public class GooWordStat {
    private String word;
    private int freq;

    public GooWordStat(String word, int freq) {
        this.word = word;
        this.freq = freq;
    }

    public String getWord() {
        return word;
    }

    public int getFreq() {
        return freq;
    }

    @Override
    public String toString() {
        String freqString = "";
        if (this.freq <1000){
            freqString = "LOW";
        }else if (this.freq >=1000 && this.freq<100000){
            freqString = "MEDIUM";
        }else if (this.freq >= 100000 && this.freq<10000000){
            freqString = "HIGH";
        }else if (this.freq >=10000000) {
            freqString = "EXTRA HIGH";
        }
        return "Word is ["+word+"], search freq is "+freqString;
    }
}
