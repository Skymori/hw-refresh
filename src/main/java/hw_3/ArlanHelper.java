package hw_3;

public class ArlanHelper {
    public String drawQuad(int n){
        int count =0;
        while (count < n){
            int count1 = 0;
            while (count1 < n){
                System.out.println("*");
                count1++;
            }
            count++;
            System.out.println();
        }
        return "";
    }
    public String drawRect(int width, int height, char c){
        int count = 0;
        while (count < height){
            int count1 = 0;
            while (count1< width){
                System.out.print(c);
                count1++;
            }
            count++;
            System.out.println();
        }
        return "";
    }
    public String drawLine(int length){
        String line = "";
        boolean star = true;
        while (length > 0){
            line+= star ? '*' : '#';
            star=!star;
            length--;
        }
        return line;
    }
    public String drawPattern(char[] pattern, int repeatCount){
        String newPattern = new String(pattern);
        String line = "";
        while (repeatCount >0){
            line+= newPattern;
            repeatCount--;
        }return line;
    }
    //Test output
    public static void main(String[] args) {
        ArlanHelper helper = new ArlanHelper();
        //Should be:
        //**
        //**
        System.out.println(helper.drawQuad(2));
    }
}
