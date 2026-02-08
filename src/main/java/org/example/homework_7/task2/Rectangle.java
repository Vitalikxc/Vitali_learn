package org.example.homework_7.task2;

public class Rectangle extends Figure {
    private final double sideOne;
    private final double sideTwo;

    public Rectangle(double sideOne, double sideTwo) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
    }

    @Override
    public double getPerimeter() {
        return 2 * (sideOne + sideTwo);
    }

    @Override
    public double getSquare() {
        return sideOne * sideTwo;
    }
}
