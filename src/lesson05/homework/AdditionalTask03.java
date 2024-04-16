package lesson05.homework;

import java.util.Scanner;

public class AdditionalTask03 {
    public static void main(String[] args) {

        // вызываем наш метод
        checkLeapYear();
    }

    // Пишем программу, которая принимает на ввод год и выводит, будет ли он высокосным или нет.
    // Чтобы в меине была одна строчка

    // 3. Напишем отдельный метод для проверки, потом вызовем его в мейне
    // в мейне то одна строка, а вот не в мейне много =)

    // Пишем свой метод проверки, со всей логикой (с чтением и выводом)
    public static void checkLeapYear() {
        System.out.print("Enter a YEAR, to know is your YEAR Leap or Not: ");
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();

        if (isLeapYear(year)) {
            System.out.println(year + " - is Leap year!");
        } else {
            System.out.println(year + " - is NOT Leap year!");
        }
    }

    // пишем отдельный метод является ли год високосным или нет
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}

