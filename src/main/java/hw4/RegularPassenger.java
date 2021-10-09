package hw4;

public class RegularPassenger extends Passenger{
    @Override
    public String getType() {
        return "Regular";
    }

    @Override
    public int getTicketPrice() {
        return 199;
    }
}
