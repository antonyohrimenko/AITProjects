package lesson12.classwork;

import java.util.Scanner;

public class Main05 {
    // пользователь вводит число, проверить простое ли оно (которые делятся нацело на себя и на 1)
    public static void main(String[] args) {


        System.out.println("Введите число и проверьте простое ли оно");
        Scanner scan = new Scanner(System.in);

        int number = scan.nextInt();


        long start = System.nanoTime();
        for (int i = 2; i < number; i++){
            if (number % i == 0) {
                System.out.println("Число НЕ ЯВЛЯЕТСЯ простым");
                return;
            }
        }
        long finish = System.nanoTime();

        System.out.println("Ваше число простое");
        System.out.println("Время " + (finish - start));





    }
}
