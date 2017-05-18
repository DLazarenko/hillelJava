import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Программу, которая предлагает пользователю ввести сумму денежного вклада в гривнах,
 * процент годовых, которые выплачивает банк, длительность вклада (лет).
 * Вывести накопленную сумму денег за каждый год и начисленные проценты.
 */
public class BankDeposit {
    public static void main(String[] args) {
        System.out.println("Input sum ");
        double sum = readNumber();
        System.out.println("Input rate");
        double rate = readNumber();
        System.out.println("Input period");
        int period = (int) readNumber();
        double rateUAH;
        for (int i = 0; i < period; i++) {
            rateUAH = sum / 100 * rate;
            System.out.println("Your rate for " + (i + 1) + " year(s) is " + (Math.rint(rateUAH * 100.0) / 100.0));
            sum = sum + rateUAH;
            System.out.println(" Your sum for " + (i + 1) + " year(s) is " + (Math.rint(sum * 100.0) / 100.0));
        }
    }

    private static double readNumber() {
        Scanner scanner = new Scanner(System.in);
        double number;
        try {
            number = scanner.nextDouble();
            return number;
        } catch (InputMismatchException e) {
            System.out.println("Incorrect input");
            return readNumber();
        }
    }
}
