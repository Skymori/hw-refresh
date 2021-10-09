package hw7.method2.figure;

import hw7.method2.Shape;

public class Qube extends Shape {
    private String name;

    public Qube() {
        this.name = "qube";
    }

    @Override
    public String getName() {
        return name;
    }
}
