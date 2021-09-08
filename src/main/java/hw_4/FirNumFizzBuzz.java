package hw_4;

public class FirNumFizzBuzz extends FirNum{
    @Override
    public int calc(int n) {
        int count = 1;
        for (int i = 0; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0 && !(i % 15 ==0)){
            count += i;
            }
        }
        return count;
    }
}

