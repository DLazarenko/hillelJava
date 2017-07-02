package lesson13;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<GeometricFigure> list = new ArrayList<>();
        Circle circle = new Circle(4);
        circle.setColor(new BlueColor());
        circle.setSquareFigure(new SquareCircle());
        list.add(circle);
        Rectangle rectangle = new Rectangle(2);
        rectangle.setColor(new RedColor());
        rectangle.setSquareFigure(new SquareRectangle());
        list.add(rectangle);
        Square square = new Square(3);
        square.setColor(new YellowColor());
        square.setSquareFigure(new SquareSquare());
        list.add(square);
        for (GeometricFigure geometricFigure : list) {
            geometricFigure.performFindSquare();
            System.out.println(geometricFigure.getColor().name());
            geometricFigure.performCalculatePrice();
            geometricFigure.performCalculateWeight();
        }
    }
}
