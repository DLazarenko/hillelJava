import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Реализовать функцию по нахождению сумм цифр в числе (123->6, 202->4).
 */
public class SumOfNumber {

    public static void main(String[] args) {
        int a = readNumber();
        int sum = 0;

        while (a > 0) {
            sum = sum + a % 10;
            a = a / 10;
        }
        System.out.println(sum);
    }

    private static int readNumber() {
        Scanner scanner = new Scanner(System.in);
        int a;
        try {
            a = scanner.nextInt();
            return a;
        } catch (InputMismatchException e) {
            System.out.println("Your input is not number");
            return readNumber();
        }
    }
}
