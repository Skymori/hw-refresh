package hw7.method2;

import hw7.method2.figure.*;

public class PrintShape implements Print{
    private Shape shape;

    public PrintShape(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void printName() {
        shape.printName();
    }
}
