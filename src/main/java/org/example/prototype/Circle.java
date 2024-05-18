package org.example.prototype;

public class Circle extends Shape {
    private int field;

    public Circle() {}

    public Circle(Circle target) {
        super(target);
        if (target != null) {
            this.field = target.field;
        }
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }
}