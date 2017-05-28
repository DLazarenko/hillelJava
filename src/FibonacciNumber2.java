/**
 * Реализовать функцию вычисления i-го числа Фибоначчи
 */
public class FibonacciNumber2 {

    public static void main(String[] args) {
        System.out.println(fib(5));
    }

    private static long[] fib = new long[51];

    private static long fib(int number) {
        if (fib[number] != 0)
            return fib[number];
        else if (number == 0 || number == 1 || number == 2) {
            fib[number] = 1;
            return 1;
        } else {
            long res = fib(number - 2) + fib(number - 1);
            fib[number] = res;
            return res;
        }
    }
}
