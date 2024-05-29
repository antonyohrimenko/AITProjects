package NGlesson24.homework;
import java.util.Scanner;


public class Task02 {

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
            System.out.println("Результат: " + CalculateExpression(input));
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        scanner.close();
    }




    // напишем кривенький метод =)
    public static double CalculateExpression(String input) {

        // приводим строку в цельный вид без пробелов
        input = input.replaceAll(" ", "");

        // ищем индекс оператора
        int operatorIndex = -1;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '+' || input.charAt(i) == '-' || input.charAt(i) == '*' || input.charAt(i) == '/') {
                operatorIndex = i;
                break;
            }
        }

        // Если оператор не найден, выбрасываем исключение
        if (operatorIndex == -1) {
            throw new IllegalArgumentException("Неверный формат ввода. Ожидается формат: число знак число");
        }


        // зная на каком индексе у нас операция спарсим 2 числа по обеим сторонам
        String num1 = input.substring(0, operatorIndex);
        String num2 = input.substring(operatorIndex + 1);
        String operator = input.substring(operatorIndex, operatorIndex + 1);

        // вычислим результат операции
        double result;

        switch (operator) {
            case "+":
                result = Integer.parseInt(num1) + Integer.parseInt(num2);
                break;
            case "-":
                result = Integer.parseInt(num1) - Integer.parseInt(num2);
                break;
            case "*":
                result = Integer.parseInt(num1) * Integer.parseInt(num2);
                break;
            case "/":
                // Обрабатываем деление на ноль
                if (Integer.parseInt(num2) == 0) {
                    throw new ArithmeticException("Деление на ноль невозможно");
                }
                result = Double.parseDouble(num1) / Double.parseDouble(num2);
                break;
            default:
                throw new IllegalArgumentException("Неверный оператор. Допустимые операторы: +, -, *, /");
        }
        return result;
    }
}
