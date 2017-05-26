import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Вывести на консоль графику (ширину и высоту задает пользователь) вида:
 * в шахматном порядке
 */
public class GraphicOnConsolRectangleOfChess {
    public static void main(String[] args) {
        int a = readNumber();
        int b = readNumber();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (i % 2 == 0) {
                    if (j % 2 == 0) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    if (j % 2 != 0) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println(" ");
        }
    }

    private static int readNumber() {
        Scanner scanner = new Scanner(System.in);
        int number;
        try {
            number = scanner.nextInt();
            return number;
        } catch (InputMismatchException e) {
            return readNumber();
        }
    }
}
