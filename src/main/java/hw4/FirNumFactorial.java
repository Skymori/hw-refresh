package hw4;

public class FirNumFactorial extends FirNum{
    @Override
    public int calc(int n) {
        int count = 1;
        for (int i = 1; i <= n; i++) {
            count*=i;
        }
        return count;
    }
}
