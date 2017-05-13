import java.util.InputMismatchException;
import java.util.Scanner;

/*
 Please input first number:
 Your input <inputted number> as a first number.
 Please input second number:
 input <inputted number> as a second number.
 Your
 Sum is <sum>
 Difference is <difference>
 Multiplication is <multiplication>
 Division is <division>
 */
public class Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(" Please input first number: ");
        int a;
        try {
            a = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Your input is not number");
            return;
        }

        System.out.println("Your input " + a + " as a first number.");

        System.out.println("Please input second number: ");
        int b;
        try {
            b = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Your input is not number");
            return;
        }
        System.out.println("Your input " + b + " as a second number.");

        System.out.println("Your");
        System.out.println("Sum is " + (a + b));
        System.out.println("Difference is " + (a - b));
        System.out.println("Multiplication is " + (a * b));
        System.out.println("Division is " + ((double) a / b));
    }
}
