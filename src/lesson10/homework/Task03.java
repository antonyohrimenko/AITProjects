package lesson10.homework;

import java.util.Random;
import java.util.Scanner;

/*
Пользователь задает вопрос. Вывести ему ответ-предсказание, симулируя популярный в поп-культуре магический шар
с нарисованной цифрой 8, который дает ответы на вопросы, если его потрясти.
 */

public class Task03 {
    public static void main(String[] args) {
        // выводим ответ на экран
        System.out.println("Ответ магического шара: " + getMagicAnswer(new Scanner(System.in).nextLine()));
    }

    // пишем метод генерации случайного ответа тоже в 1 строку :)
    public static String getMagicAnswer(String question) {
        return new String[]{"Да.", "Нет.", "Весьма вероятно.", "Не рассчитывай на это.", "Не могу предсказать.", "Да, но будь осторожен.", "По всей видимости.", "Знаки указывают на \"да\".", "Знаки указывают на \"нет\"."}[new Random().nextInt(9)];
    }

}
