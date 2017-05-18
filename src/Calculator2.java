import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Новое требование от заказчика калькулятора - переделать калькулятор,
 * чтобы при неправильном вводе чисел программа запрашивала число заново и пользователь сам вводил операцию
 */
public class Calculator2 {

    public static void main(String[] args) throws InterruptedException {

        double result = readNumber();
        String operation = readMathOperation();
        while (!operation.equals("=")) {
            double number = readNumber();
            switch (operation) {
                case "-":
                    result = result - number;
                    break;
                case "+":
                    result = result + number;
                    break;
                case "*":
                    result = result * number;
                    break;
                case "/":
                    if (number == 0) {
                        System.out.println("You can not divide by zero.");
                    } else {
                        result = result / number;
                    }
                    break;
                default:
                    break;
            }
            operation = readMathOperation();
        }
        System.out.println(result);
    }

    private static double readNumber() {
        System.out.println("Please input number: ");
        Scanner scanner = new Scanner(System.in);
        double a;
        try {
            a = scanner.nextDouble();
            return a;
        } catch (InputMismatchException e) {
            System.out.println("Your input is not number.");
            return readNumber();
        }
    }

    private static String readMathOperation() {
        System.out.println("Please input operator:");
        Scanner scanner = new Scanner(System.in);
        String nexLine = scanner.next();
        if (nexLine.equals("+") || nexLine.equals("-") || nexLine.equals("*") || nexLine.equals("/") || nexLine.equals("=")) {
            return nexLine;
        } else {
            System.out.println("Incorrect operation.");
            return readMathOperation();
        }
    }

}
