package lesson13;

public class SquareRectangle implements SquareFigure {

    @Override
    public double findSquare(int i) {
        double s = (Math.sqrt(3) * i * i) / 4;
        System.out.println(s);
        return s;
    }
}