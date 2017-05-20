import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Программа, которая находит среднее арифметическое значение произвольного количества чисел.
 */
public class ArithmeticMeanOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        double count = 0;
        double result;
        while (true) {
            try {
                sum = sum + scanner.nextDouble();
                count++;
            } catch (InputMismatchException e) {
                if (scanner.next().equals("end")) {
                    result = sum / count;
                    System.out.println(result);
                    break;
                } else {
                    System.out.println("Your input is not correct.");
                    System.out.println("Repeat input.");
                }

            }
        }
    }
}
