import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Программу, которая предлагает пользователю ввести сумму денежного вклада в гривнах,
 * процент годовых, которые выплачивает банк, длительность вклада (лет).
 * Вывести накопленную сумму денег за каждый год и начисленные проценты.
 */
public class BankDeposit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input sum ");
        double sum;
        try {
            sum = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Incorrect input");
            return;
        }

        System.out.println("Input rate");
        double rate;
        try {
            rate = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Incorrect input");
            return;
        }

        System.out.println("Input period");
        int period;
        try {
            period = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Incorrect input");
            return;
        }

        double rateUAH;
        for (int i = 0; i < period; i++) {
            rateUAH = sum / 100 * rate;
            System.out.println("Your rate for " + (i + 1) + " year(s) is " + (Math.rint(rateUAH * 100.0) / 100.0));
            sum = sum + rateUAH;
            System.out.println(" Your sum for " + (i + 1) + " year(s) is " + (Math.rint(sum * 100.0) / 100.0));
        }
    }
}
