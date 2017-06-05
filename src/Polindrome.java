import java.util.Scanner;

/**
 * Определить является ли число палиндромом
 */
public class Polindrome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.next();
        char[] charArray = line.toCharArray();
        int[] intArray = new int[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            intArray[i] = Integer.parseInt(String.valueOf(charArray[i]));
        }
        boolean result = false;
        if (intArray.length % 2 == 0) {
            for (int i = 0; i <= intArray.length / 2; i++) {
                if (intArray[i] == intArray[intArray.length - 1 - i]) {
                    result = true;
                } else {
                    result = false;
                    break;
                }
            }
        } else if (intArray.length % 2 != 0) {
            for (int i = 0; i < intArray.length / 2; i++) {
                if (intArray[i] == intArray[intArray.length - 1 - i]) {
                    result = true;
                } else {
                    result = false;
                    break;
                }
            }
        }
        if (result) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}