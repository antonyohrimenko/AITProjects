package NGlesson24.homework.Task01;

import java.util.Arrays;
import java.util.Scanner;

public class Task01 {

    /*
Пользователь вводит строку
Разделите строку на слова
В каждом слове оставьте только первую букву
Сложите все первые буквы слов в одно слово
Напишите на экран размер получившейся строки, а также первую и последнюю буквы слова
     */

    public static void main(String[] args) {

        System.out.println("Введите строку текста");
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        String[] input = str.split(" ");

        System.out.println(Arrays.toString(input)); // ввыводим проверяем что строка разделилась


        // создадим массив, где будем хранить первые буквы слов
        String[] resultString = new String[input.length];

        for (int i = 0; i < input.length; i++) {
            resultString[i] = input[i].substring(0, 1);
        }
        // ввыводим проверяем что хранятся первые буквы
        System.out.println(Arrays.toString(resultString));

        // сложим все буквы в одно слово
        String finalResult = "";

        for (int i = 0; i < resultString.length; i++) {
            finalResult += resultString[i];
        }

        // выведем результат, размер и первую и последнюю букву слова
        System.out.println(finalResult);
        System.out.println("Размер строки: " + finalResult.length());
        System.out.println("Первая буква: " + finalResult.substring(0, 1));
        System.out.println("Последняя буква: " + finalResult.substring(finalResult.length() - 1));
    }
}
