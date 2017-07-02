package lesson13;

public class SquareSquare implements SquareFigure {
    @Override
    public double findSquare(int i) {
        double s = i * i;
        System.out.println(s);
        return s;
    }
}