import java.util.Scanner;

/**
 * Хранение данных о студентах (фамилии, оценки, посещение) - продумать реализацию.
 * Хранение данных о студентах (массив фамилий) реализовать функции :
 * добавление нового студента
 * удаление по фамилии
 * contains - есть ли студент с определенной фамилией в группе
 * clear - очистка массива
 * trim - удаление пустых элементов массива
 * объединение двух групп
 * сортировка по фамилии
 * containsAll - есть ли группа студентов в другой группе
 * equals - одинаковые ли группы
 * print - красивый вывод на печать группы
 */
public class StudentsGroup {

    private static String[][] students = new String[0][];

    public static void main(String[] args) {
        System.out.println("Chose command.");
        String readOption = readLine();
        while (!(readOption.equals("exit"))) {
            switch (readOption) {
                case "add":
                    addStudents();
                    break;
                case "delete":
                    deleteStudents();
                    break;
                case "contains":
                    containsStudents();
                    break;
                case "clear":
                    clearStudents();
                    break;
                case "trim":
                    trimStudents();
                    break;
                case "unite":
                    uniteStudents();
                    break;
                case "sort":
                    sortStudents();
                    break;
                case "print":
                    printStudents();
                    break;
            }
            System.out.println("Choose command");
            readOption = readLine();
        }
    }

    private static void addStudents() {
        String[][] newStudents = new String[students.length + 1][];
        for (int i = 0; i < students.length; i++) {
            newStudents[i] = students[i];
        }
        students = newStudents;

        String surname;
        String group;
        String[] student = new String[2];
        System.out.println("Input surname");
        student[0] = readLine();
        System.out.println("Input group");
        student[1] = readLine();
        students[students.length - 1] = student;
    }

    private static String readLine() {
        Scanner scanner = new Scanner(System.in);
        String option = scanner.next();
        return option;
    }

    private static void deleteStudents() {
        System.out.println("Input surname.");
        String surname = readLine();
        for (int i = 0; i < students.length; i++) {
            if (students[i][0].equals(surname)) {
                students[i] = null;
            }
        }
        trimStudents();
    }

    private static void containsStudents() {
        System.out.println("Input surname.");
        String surname = readLine();
        for (int i = 0; i < students.length - 1; i++) {
            if (students[i][0].equals(surname)) {
                System.out.println("Yes");
            }
        }
    }

    private static void clearStudents() {
        students = null;
    }

    private static void trimStudents() {
        int countNull = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i][0] == null) {
                countNull++;
            }
        }
        String[][] newStudents = new String[students.length - countNull][];
        int index = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                newStudents[index] = students[i];
                index++;
            }

        }
        students = newStudents;
    }

    private static void uniteStudents() {
        System.out.println("Input name of the new common group");
        String newCommonGroup = readLine();
        for (int i = 0; i < students.length; i++) {
            students[i][1] = newCommonGroup;
        }
    }

    private static void sortStudents() {
        for (int i = students.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                int resultComparision = students[j][0].compareTo(students[j + 1][0]);
                if (resultComparision != (-1) && resultComparision != (0)) {
                    String[] t = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = t;
                }
            }
        }
    }

    private static void printStudents() {
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i][0] + " " + students[i][1]);
        }
    }
}