package hw_4;

public class FirNumBasis extends FirNum{
    @Override
    public int calc(int n) {
        int count = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0){
                count +=i;
            }
        }
        return count / 2;
    }
}
