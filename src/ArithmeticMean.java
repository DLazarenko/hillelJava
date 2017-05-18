import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithmeticMean {

    public static void main(String[] args) {
        double a = readNumber();
        double b = readNumber();
        double arithmeticMean = (a + b) / 2;
        System.out.println("Result " + arithmeticMean);
    }

    private static double readNumber() {
        Scanner scanner = new Scanner(System.in);
        double number;
        try {
            number = scanner.nextDouble();
            return number;
        } catch (InputMismatchException e) {
            System.out.println("Your input is not number");
            return readNumber();
        }
    }
}