import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Развернуть число (123456 -> 654321)
 */
public class ReverseNumber {

    public static void main(String[] args) {

        System.out.println(reverseNumber(readNumber()));
    }

    private static int readNumber() {
        System.out.println("Please input your number.");
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

    private static int reverseNumber(int number) {
        int num = number;
        int result = 0;
        while (num != 0) {
            int last = num % 10;
            result *= 10;
            result += last;
            num /= 10;
        }
        return result;
    }
}