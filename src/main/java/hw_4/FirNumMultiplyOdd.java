package hw_4;

public class FirNumMultiplyOdd extends FirNum{
    @Override
    public int calc(int n) {
        int count = 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 !=0){
                count*=i;
            }
        }
        return count;
    }
}
