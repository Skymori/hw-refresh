package hw_4;

public class FirNumSum extends FirNum{
    @Override
    public int calc(int n) {
        int count = 0;
        for (int i = 0; i <= n; i++) {
            count+=i;
        }
        return count;
    }
}
