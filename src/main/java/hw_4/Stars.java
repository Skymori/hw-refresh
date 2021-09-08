package hw_4;

public class Stars {
    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < (count/1000); i++) {
            s+= "X";
        }
        for (int i = 0; i < (count%1000)/100; i++) {
            s+= "Y";
        }
        for (int i = 0; i < (count%100)/10; i++) {
            s+= "Z";
        }
        for (int i = 0; i < (count%10); i++) {
            s+= "*";
        }

        return s;
    }
}
