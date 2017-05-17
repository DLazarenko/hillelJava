import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.StrictMath.sqrt;

public class SimpleNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        try {
            x = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Your input is not number");
            return;
        }
        if (x < 2) {
            System.out.println("Not simple number");
        } else if (x == 2) {
            System.out.println("Simple number");
        } else if (x > 2) {
            for (int i = 2; i <= sqrt(x); i++) {
                if (x % i == 0) {
                    System.out.println("Not simple number");
                    return;
                }
            }
            System.out.println("Simple number");
        }
    }

}
