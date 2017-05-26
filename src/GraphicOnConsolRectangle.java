import java.util.Scanner;

/**
 * Вывести на консоль графику (ширину и высоту задает пользователь) вида:
 * прямоугольник
 */
public class GraphicOnConsolRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (i == 0 || i == a - 1) {
                    System.out.print("*");
                } else {
                    if (j == 0 || j == b - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println("");
        }
    }
}
