import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithmeticMean {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double a;
        try {
            a = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Your input is not number");
            return;
        }

        double b;
        try {
            b = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Your input is not number");
            return;
        }

        double arithmeticMean = (a + b) / 2;
        System.out.println("Result " + arithmeticMean);
    }
}
