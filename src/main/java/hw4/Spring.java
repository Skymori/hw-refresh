package hw4;

public class Spring extends Season{
    @Override
    public String getName() {
        return "spring";
    }

    @Override
    public boolean isCold() {
        return false;
    }
}
