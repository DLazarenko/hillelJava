package lesson13;

import java.util.Scanner;

abstract class GeometricFigure {
    private SquareFigure squareFigure;
    private Color color;

    public GeometricFigure() {

    }

    public void performFindSquare() {
        Scanner scanner = new Scanner(System.in);
        int x = Integer.parseInt(scanner.next());
        squareFigure.findSquare(x);
    }

    public void performCalculatePrice() {

    }

    public void performCalculateWeight() {

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
