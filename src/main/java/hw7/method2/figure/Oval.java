package hw7.method2.figure;

import hw7.method2.Shape;

public class Oval extends Shape {
    private String name;

    public Oval() {
        this.name = "oval";
    }

    @Override
    public String getName() {
        return name;
    }
}
