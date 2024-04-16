package lesson06.classwork;

import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {

        // пользователь вводит число, проверить целое ли оно?

        System.out.println("Введите любое число: ");
        Scanner scan = new Scanner(System.in);

        double num = scan.nextDouble();
       // System.out.println(num % 1 == 0 ? "Целое число" : "Не целое число");
        System.out.println((int)num == num ? "Целое число" : "Не целое число");

    }
}
