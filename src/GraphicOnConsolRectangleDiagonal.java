import java.util.Scanner;

/**
 * Произвольный прямоугольник с двумя диагоналями.
 */
public class GraphicOnConsolRectangleDiagonal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int tg = b / a;
        int ctg = a / b;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (i == 0 || i == a - 1) {
                    System.out.print("*");
                } else {
                    if (j == 0 || j == b - 1)
                        System.out.print("*");
                    else if (tg >= 1 && j == i * tg)
                        System.out.print("*");
                    else if (tg >= 1 && j == b - 1 - i * tg)
                        System.out.print("*");
                    else if (tg < 1 && j == i / ctg)
                        System.out.print("*");
                    else if (tg < 1 && j == b - 1 - i / ctg)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
}
