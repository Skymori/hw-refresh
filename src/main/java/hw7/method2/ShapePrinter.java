package hw7.method2;

public class ShapePrinter implements Printer {
    private Shape shape;

    public ShapePrinter(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void namePrinter() {
        shape.namePrinter();
    }
}
