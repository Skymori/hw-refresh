package hw7.method2;

public abstract class Shape implements Printer {
    public abstract String getName();

    @Override
    public void namePrinter() {
        System.out.println(getName());
    }
}
