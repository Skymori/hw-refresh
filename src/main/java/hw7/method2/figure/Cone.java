package hw7.method2.figure;

import hw7.method2.Shape;

public class Cone extends Shape {
    private String name;

    public Cone() {
        this.name = "cone";
    }

    @Override
    public String getName() {
        return name;
    }
}
