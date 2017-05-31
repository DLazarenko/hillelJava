import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Пользователь вводит массу в граммах вывести массу в соответствующих единицах измерения.
 */
public class Kg {

    public static void main(String[] args) {
        int value = readNumber();
        int g = value % 1000;
        value = value / 1000;
        int kg = value % 1000;
        value = value / 1000;
        int t = value;
        System.out.println(t + " t");
        System.out.println(kg + " kg");
        System.out.println(g + " g");
    }

    private static int readNumber() {
        int value;
        try {
            Scanner scanner = new Scanner(System.in);
            value = scanner.nextInt();
            return value;
        } catch (InputMismatchException e) {
            System.out.println("Incorrect input. Try again.");
        }
        return readNumber();
    }
}
