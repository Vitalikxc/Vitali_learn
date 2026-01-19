package org.example.homework_7.task2;

public class Circle extends Figure {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getSquare() {
        return Math.PI * Math.pow(radius, 2);
    }
}
