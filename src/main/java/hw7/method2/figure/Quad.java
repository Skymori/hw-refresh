package hw7.method2.figure;

import hw7.method2.Shape;

public class Quad extends Shape {
    private String name;

    public Quad() {
        this.name = "quad";
    }

    @Override
    public String getName() {
        return name;
    }
}
