package org.example.homework_7.task2;

public class Triangle extends Figure {
    private final double sideOne;
    private final double sideTwo;
    private final double sideThree;

    public Triangle(double sideOne, double sideTwo, double sideThree) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.sideThree = sideThree;
    }

    @Override
    public double getPerimeter() {
        return sideOne + sideTwo + sideThree;
    }

    @Override
    public double getSquare() {
        double p = (sideOne + sideTwo + sideThree) / 2;
        return Math.sqrt(p * (p - sideOne) * (p - sideTwo) * (p - sideThree));
    }
}
