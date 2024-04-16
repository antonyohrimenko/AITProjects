package lesson09.homework;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {

        /*
        Запросить у пользователя цифру от 1 до 9.
        Вывести "пирамидку" из цифр (см. примеры), где вершиной будет цифра, введенная пользователем

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите цифру от 1 до 9:");
        int userNum = scan.nextInt();

        // Выводим первую половину пирамиды (по возрастанию до вершины)
        for (int i = 1; i <= userNum; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        // Выводим вторую половину пирамиды (спускаемся с вершины)
        for (int i = userNum - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
