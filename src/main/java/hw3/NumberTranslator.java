package hw3;

public class NumberTranslator {
    public int translate(String romanNumber){
        romanNumber = romanNumber.toUpperCase().replaceAll(" ", "").strip();
        int digitAge;
        switch (romanNumber){
            case "I":
                digitAge = 1;
                break;
            case "II":
                digitAge = 2;
                break;
            case "III":
                digitAge = 3;
                break;
            case "IV":
                digitAge = 4;
                break;
            case "V":
                digitAge = 5;
                break;
            case "VI":
                digitAge = 6;
                break;
            case "VII":
                digitAge = 7;
                break;
            case "VIII":
                digitAge = 8;
                break;
            case "IX":
                digitAge = 9;
                break;
            case "X":
                digitAge = 10;
                break;
            case "XI":
                digitAge = 11;
                break;
            case "XII":
                digitAge = 12;
                break;
            default:
                digitAge = -1;
        }
        return digitAge;
    }
}
