/**
 * Реализовать функцию вычисления i-го числа Фибоначчи
 */

public class FibonacciNumber {

    public static void main(String[] args) {
        System.out.println(fib(5));
    }

    private static int fib(int index) {
        if (index == 0 || index == 1 || index == 2)
            return 1;
        else
            return fib(index - 1) + fib(index - 2);
    }
}

