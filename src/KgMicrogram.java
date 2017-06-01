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
        int value = Integer.parseInt(stroka);
        switch (weightUnit) {
            case "microgram":
                int microgram = value % 1000;
                value /= 1000;
                if (microgram != 0)
                    System.out.print(microgram + " microgram");
            case "gram":
                int gram = value % 1000;
                value /= 1000;
                if (gram != 0)
                    System.out.print(gram + " gram ");
            case "kg":
                int kg = value % 1000;
                value /= 1000;
                if (kg != 0)
                    System.out.print(kg + " kg ");
            case "t":
                int t = value;
                if (t != 0)
                    System.out.print(t + " t ");
        }
    }
}
