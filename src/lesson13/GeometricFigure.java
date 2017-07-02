package lesson13;

import java.util.Scanner;

abstract class GeometricFigure {
    private SquareFigure squareFigure;
    private Color color;
    int side;

    public GeometricFigure(int side) {
        this.side = side;
    }

    public double performFindSquare() {
        double s = squareFigure.findSquare(side);
        return s;
    }

    public void performCalculatePrice() {
        double price = performFindSquare() * getColor().consumption() * getColor().price();
        System.out.println(price);
    }

    public void performCalculateWeight() {
        double weight = performFindSquare() * getColor().consumption();
        System.out.println(weight);
    }

    public SquareFigure getSquareFigure() {
        return squareFigure;
    }

    public Color getColor() {
        return color;
    }

    public void setSquareFigure(SquareFigure squareFigure) {
        this.squareFigure = squareFigure;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
