package lesson07.classwork;

import java.util.Scanner;

public class Main04 {
    public static void main(String[] args) {
        // существует ли треугольник

        System.out.println("Введите длину стороны A: ");
        int a = new Scanner(System.in).nextInt();
        System.out.println("Введите длину стороны B: ");
        int b = new Scanner(System.in).nextInt();
        System.out.println("Введите длину стороны C: ");
        int c = new Scanner(System.in).nextInt();

        if ((a < b + c) && (b < a + c) && (c < a + b)) {
            System.out.println("Треугольник существует.");
        } else {
            System.out.println("Треугольник не существует.");
        }

    }




}
