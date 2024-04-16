package lesson06.homework;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {

        /*
        Разработайте систему тестирования, которая задаст пять вопросов по теме "Примитивные типы данных и переменные"
        На каждый тестовый вопрос должна быть возможность выбрать один из трех вариантов ответа (через сканнер).
        Если выбран правильный вариант, следует увеличить количество баллов на 1.
        В конце теста нужно вывести оценку. Если оценка 3 или выше написать "Вы справились с тестом",
        а если ниже - "Вы провалились"
         */

        Scanner scan = new Scanner(System.in);
        int score = 0;

        System.out.println("Вопрос 1: Что такое примитивный тип данных в Java?");
        System.out.println("   a) Он является основой для создания всех других типов данных.");
        System.out.println("   b) Он представляет основные типы данных, которые не являются объектами.");
        System.out.println("   c) Он представляет классы, которые наследуются от Object.");
        System.out.print("Ваш ответ (введите букву): ");
        String answer1 = scan.next();

        if (answer1.equals("b")) {
            score++;
        }

        System.out.println("Вопрос 2: Какой тип данных НЕ является числовым?");
        System.out.println("   a) String");
        System.out.println("   b) short");
        System.out.println("   c) long");
        System.out.print("Ваш ответ (введите букву): ");
        String answer2 = scan.next();

        if (answer2.equals("a")) {
            score++;
        }

        System.out.println("Вопрос 3:  Какой тип данных занимает 32 бита?");
        System.out.println("   a) long");
        System.out.println("   b) int");
        System.out.println("   c) double");
        System.out.print("Ваш ответ (введите букву): ");
        String answer3 = scan.next();

        if (answer3.equals("b")) {
            score++;
        }

        System.out.println("Вопрос 4:  Какой из типов данных используется для хранения дробных чисел?");
        System.out.println("   a) int");
        System.out.println("   b) double");
        System.out.println("   c) boolean");
        System.out.print("Ваш ответ (введите букву): ");
        String answer4 = scan.next();

        if (answer4.equals("b")) {
            score++;
        }

        System.out.println("Вопрос 5:  Какой тип данных в Java используется для хранения символов?");
        System.out.println("   a) char");
        System.out.println("   b) String");
        System.out.println("   c) byte");
        System.out.print("Ваш ответ (введите букву): ");
        String answer5 = scan.next();

        if (answer5.equals("a")) {
            score++;
        }

        System.out.println("Ваша оценка: " + score);
        System.out.println(score >= 3 ? "Вы справились с тестом!" : "Вы провалились.");
    }
}