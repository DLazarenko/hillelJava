package lesson13;

public class SquareRectangle implements SquareFigure {
    @Override
    public void findSquare(int i) {
        double s = (Math.sqrt(3) * i * i) / 4;
    }
}
