package lesson13;

public class SquareCircle implements SquareFigure {

    @Override
    public void findSquare(int i) {
        double s = Math.PI * i * i;
        System.out.println(s);
    }
}
