package lesson13;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<GeometricFigure> list = new ArrayList<>();
        Circle circle = new Circle();
        circle.setColor(new BlueColor());
        circle.setSquareFigure(new SquareCircle());
        list.add(circle);
        for (GeometricFigure geometricFigure : list) {
            geometricFigure.performFindSquare();
        }
    }
}
