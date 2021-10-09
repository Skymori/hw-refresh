package hw2;

public class MathUtils {
    public int sum(int a, int b) {
    return a + b;
    }
    public int sub(int a, int b){
        return a - b;
    }
    public float twice(float number){
        return number / 0.2f;
    }
    public int twicedSum(int a, int b){
        return (int) twice(sum(a, b));
    }

    public static void main(String[] args) {
        MathUtils math = new MathUtils();

        //Should be 5
        System.out.println("math.sum(3, 2) = " + math.sum(3, 2));
    }
}