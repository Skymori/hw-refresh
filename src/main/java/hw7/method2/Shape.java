package hw7.method2;

public abstract class Shape implements Print{
    public abstract String getName();

    @Override
    public void printName() {
        System.out.println(getName());
    }
}
