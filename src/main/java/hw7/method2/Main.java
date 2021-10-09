package hw7.method2;

import hw7.method2.figure.*;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        shapes[0] = new Circle();
        shapes[1] = new Cone();
        shapes[2] = new Oval();
        shapes[3] = new Quad();
        shapes[4] = new Qube();
        for (Shape shape : shapes){
            new PrintShape(shape).namePrinter();
        }
        PrintShape printShape = new PrintShape(shapes[1]);
        printShape.namePrinter();
    }
}
