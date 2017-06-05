/**
 * Двумерный массив 10х10, заполнить случайными числами от -20 до 20. Реализовать функцию:
 * определения суммы элементов массива,
 * среднее арифметическое,
 * минимальный элемент,
 * максимальный элемент,
 * число положительных элементов
 * сумму по строкам.
 */
public class RandomArray {

    public static void main(String[] args) {

        int[][] array = new int[10][10];
        generateRandomArray(array);
        System.out.println(arithmeticMeanOfNumbers(array));
        System.out.println(sum(array));
        System.out.println(min(array));
        System.out.println(max(array));
        System.out.println(getPositiveNumbersCount(array));
        sumOfLine(array);
    }

    private static int random() {
        int max = 21;
        int min = -21;
        int result = (int) (min + (max - min) * Math.random());
        return result;
    }


    private static int[][] generateRandomArray(int[][] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random();
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }
        return array;
    }

    private static int arithmeticMeanOfNumbers(int[][] array) {
        int arithmeticMeanOfNumbers = sum(array) / 100;
        return arithmeticMeanOfNumbers;
    }

    private static int sum(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum = sum + array[i][j];
            }
        }
        return sum;
    }

    private static int min(int[][] array) {
        int min = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length - 1; j++) {
                if (min > array[i][j + 1]) {
                    min = array[i][j + 1];
                }
            }
        }
        return min;
    }

    private static int max(int[][] array) {
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length - 1; j++) {
                if (max < array[i][j + 1]) {
                    max = array[i][j + 1];
                }
            }
        }
        return max;
    }

    private static int getPositiveNumbersCount(int[][] array) {
        int positiveNumbersCount = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length - 1; j++) {
                if (array[i][j] >= 0) {
                    positiveNumbersCount++;
                }
            }
        }
        return positiveNumbersCount;
    }

    private static void sumOfLine(int[][] array) {

        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum = sum + array[i][j];
            }
            System.out.print(sum + " ");
        }
    }
}
