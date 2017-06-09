import java.util.Scanner;

/**
 * Пользователь вводит число, нужно запросить единицы измерения и вывести данные о массе.
 */
public class KgMicrogram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stroka = scanner.next();
        System.out.println("Input weight unit.");
        String weightUnit = scanner.next();
        long value = Long.parseLong(stroka);
        long t = 0;
        long kg = 0;
        long gram = 0;
        long microgram = 0;
        switch (weightUnit) {
            case "microgram":
                microgram = value % 1000;
                value /= 1000;
            case "gram":
                gram = value % 1000;
                value /= 1000;
            case "kg":
                kg = value % 1000;
                value /= 1000;
            case "t":
                t = value;
        }
        if (t != 0) {
            System.out.print(t + " t ");
        }
        if (kg != 0) {
            System.out.print(kg + " kg ");
        }
        if (gram != 0) {
            System.out.print(gram + " gram ");
        }
        if (microgram != 0) {
            System.out.println(microgram + " microgram ");
        }
    }
}
