package hw3;

import java.util.Arrays;

public class HarekCity {
    public String[] createEmptyNameArray() {
        String[] result= {};
        return result;
    }
    public int[] createAgeArray(int age1, int age2, int age3, int age4){
        return new int[]{age1,age2,age3,age4};
    }
    public void fixNames(String[] names, String[] toReplace){
        names[1] = toReplace[0];
        names[3] = toReplace[1];
    }
    public String firstAndLastTogether(String[] names){
        return names[0]+" AND "+ names[9]+" TOGETHER";
    }
    public void changeElectResult(String[] results){
        String st = results[0];
        results[0] = results[results.length-1];
        results[results.length-1] = st;
    }
    public String[] changeElectResultAgain(String[] results){
        results [0] = results[2];
        results [1] = results[3];
        results [2] = results[4];
        String [] st = Arrays.copyOf(results,results.length-2);
        return st;
    }
    public char[][] createKeyboard(){
        return new char[][]{
                {'1', '2', '3'},
                {'4', '5', '6'},
                {'7', '8', '9'},
                {'*', '0', '#'}
        };
    }
    public void printKeyboard(){
        char[][] button = createKeyboard();
        System.out.println(
                Arrays.toString(button[0])
                +"\n"+Arrays.toString(button[1])
                +"\n"+Arrays.toString(button[2])
                +"\n"+Arrays.toString(button[3])
        );
    }
    public String[] makeCopy(String[] names){
        String [] arrCopy = Arrays.copyOf(names,names.length);
        System.out.println("Copied!"+"\n"+ Arrays.toString(arrCopy));
        return arrCopy;
    }
    public static void main(String[] args) {
        String[] arr = new HarekCity().createEmptyNameArray();
        System.out.println(Arrays.toString(arr));
    }
}
