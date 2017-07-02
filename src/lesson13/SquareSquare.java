package lesson13;

public class SquareSquare implements SquareFigure {
    @Override
    public void findSquare(int i) {
        double s = i * i;
        System.out.println(s);
    }
}