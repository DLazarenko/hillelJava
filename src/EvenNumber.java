import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Ввести число, определить четное или нет.
 */
public class EvenNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a;

        try {
            a = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Your input is not number");
            return;
        }

        if (a % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Not even number");
        }
    }
}
