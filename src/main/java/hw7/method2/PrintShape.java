package hw7.method2;

public class PrintShape implements Printer {
    private Shape shape;

    public PrintShape(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void namePrinter() {
        shape.namePrinter();
    }
}
