package lesson04.homework;

import java.util.Scanner;

public class Task03
{
    public static void main(String[] args) {
        // Задание: сделать так чтобы при вводе, например 2 3 программа выводила 2 + 3 = 5

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите два числа и узнайте сумму");
        System.out.println("Введите первое число: ");
        int   a = scan.nextInt();
        System.out.println("Введите второе число: ");
        int b = scan.nextInt();

        //System.out.println("Сумма ваших двух чисел " + a + " + " + b + " = " + (a+b));
        System.out.printf("%d + %d = %d%n", a, b, (a+b));
    }
}
