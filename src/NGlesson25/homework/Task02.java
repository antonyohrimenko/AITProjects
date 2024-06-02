package NGlesson25.homework;

import java.util.Scanner;

/*
Пользователь вводит два числа - начальное и конечное число.
Выведите на экран все числа в этом промежутке,
НО решить необходимо только с использование рекурсии.
 */

public class Task02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите начальное число: ");
        int start = scanner.nextInt();

        System.out.println("Введите конечно число: ");
        int finish = scanner.nextInt();

        System.out.println("Ваша последовательность: \n");
        printSequence(start, finish);
        scanner.close();
    }

    public static void printSequence(int start, int finish) {
        System.out.println(start);
        if (start == finish) {
            return;
        }
        printSequence(start + 1, finish);
    }
}
