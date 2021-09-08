package hw_3;

public class TrurlBank {
    public int sumQuads(int n){
        int sum = 0;
        while (n > 0){
            sum += Math.pow(n,2);
            n--;
        }return sum;
    }
    public int countSumOfDigits(int number){
        int sum = 0;
        while (number>0){
            sum += number %10;
            number /=10;
        }return sum;
    }
    public static void main(String[] args) {
        TrurlBank bank = new TrurlBank();

        //Should be 14 - 1 + 4 + 9
        System.out.println(bank.sumQuads(3));
    }
}
