package hw7.method2;

import hw7.method2.figure.*;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape cone = new Cone();
        Shape oval = new Oval();
        Shape quad = new Quad();
        Shape qube = new Qube();

        circle.printName();
        cone.printName();
        oval.printName();
        quad.printName();
        qube.printName();
    }
}
