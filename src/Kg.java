import java.util.Scanner;

/**
 * Пользователь вводит массу в граммах вывести массу в соответствующих единицах измерения.
 */
public class Kg {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.next();
        if (number.contains(".")) {
            String[] numberSplit = number.split("\\.");
            int valueInG = Integer.parseInt(numberSplit[0]);
            int microgram = Integer.parseInt(numberSplit[1]);
            int gram = valueInG % 1000;
            valueInG /= 1000;
            int kg = valueInG % 1000;
            valueInG /= 1000;
            int t = valueInG;
            System.out.println(t + "t " + kg + "kg " + gram + "g " + microgram + "mg ");
        } else {
            int valueInG = Integer.parseInt(number);
            int gram = valueInG % 1000;
            valueInG /= 1000;
            int kg = valueInG % 1000;
            valueInG /= 1000;
            int t = valueInG;
            System.out.println(t + "t " + kg + "kg " + gram + "g ");
        }
    }
}
