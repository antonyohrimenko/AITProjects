package lesson06.classwork;

import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {

        // пользователь вводит число проверить его на парность
        // System.out.println("Введите число: ");
        // Scanner scan = new Scanner(System.in);

        // int number = scan.nextInt();
        // System.out.println(number % 2==0 ? "Число парное" : "Число не парное");

        System.out.println(new Scanner(System.in).nextInt() % 2 == 0 ? "Число парное" : "Число не парное");

    }
}
