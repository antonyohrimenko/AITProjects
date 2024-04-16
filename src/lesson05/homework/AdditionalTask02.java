package lesson05.homework;

import java.util.Scanner;

public class AdditionalTask02 {
    public static void main(String[] args) {

        // напишите программу, которая принимает на ввод год и выводит, будет ли он высокосным или нет.
        // Сделайте это через if, потом через тернарный оператор, а потом так, чтобы в меине была одна строчка

        System.out.println("Enter a YEAR, to know is your YEAR Leap or Not: ");
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();

        // Год является высокосным, если он кратен 4,
        // но не кратен 100, либо кратен 400.

        // 1. Проверяем через if

        /*
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " - Leap year");
        }
        else {
            System.out.println(year + " - NOT Leap year");
        }
         */

        // 2. Проверка через тернарный оператор ?:

       System.out.println((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)? year + " Leap year!" : year + " NOT Leap year!");

    }
}
