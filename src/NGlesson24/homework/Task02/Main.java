package NGlesson24.homework.Task02;

import java.util.Scanner;


public class Main {

    /*
Пользователь вводит строку вида:
число знак число
Выведите ответ на выражение
4 + 4
23 * 78
12 / 45
3 - 7
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Запрашиваем у пользователя ввод строки
        System.out.println("Введите выражение (формат: число знак число):");
        String input = scanner.nextLine();

        // Вычисляем результат
        try {
            Calculator calculator = new Calculator();
            System.out.println("Результат: " + calculator.calculateExpression(input));
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        scanner.close();
    }
}