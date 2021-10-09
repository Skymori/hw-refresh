package hw4;

public class JupiterStar extends Spaceport{

    @Override
    public int calculateTotalPrice(int passengerCount) {
        return 500 + passengerCount * 2;
    }
}
