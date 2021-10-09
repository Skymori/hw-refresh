package hw7.method2.figure;

import hw7.method2.Shape;

public class Circle extends Shape {
    private String name;

    public Circle() {
        this.name = "circle";
    }

    @Override
    public String getName() {
        return name;
    }
}
