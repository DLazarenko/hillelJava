import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Ввести число, определить каким числам оно кратно.
 */
public class NumberDividers {
    public static void main(String[] args) {
        int number = readNumber();
        for (int i = 1; i <= number; i++) {
            if (number % i == 0)
                System.out.println("Number divisor is " + i);
        }
    }

    private static int readNumber() {
        Scanner scanner = new Scanner(System.in);
        int number;
        try {
            number = scanner.nextInt();
            return number;
        } catch (InputMismatchException e) {
            System.out.println("Your input is not number.");
            return readNumber();
        }
    }
}

