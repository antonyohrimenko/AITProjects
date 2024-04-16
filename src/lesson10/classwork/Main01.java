package lesson10.classwork;

import java.util.Random;
import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {

        // пользователь вводит нижнюю и верхнюю границу, а программа
        // дает число в этой границе

        System.out.println("Введите нижнюю границу");
        Scanner scan = new Scanner(System.in);
        int min_range = scan.nextInt();

        System.out.println("Введите верхнюю границу");
        int max_range = scan.nextInt();
        Random rnd = new Random();

        System.out.println("Число в диапазоне " + min_range + " до " + max_range +  " пусть будет " +(min_range + rnd.nextInt(max_range-min_range+1)));



    }
}
