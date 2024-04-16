package lesson10.classwork;

import java.util.Random;
import java.util.Scanner;

public class Main04 {
    public static void main(String[] args) {

        // пользователь вводит размер массива
        // заполнить его случайными числами
        // в диапазоне от -10 до 10
        // заменить отрицательные значниея на 0

        System.out.println("Введите размер массива: ");
        Scanner scan = new Scanner(System.in);
        int max_range = scan.nextInt();

        Random rnd = new Random();
        int[] array = new int[max_range];

        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(21) - 10;
            System.out.println(i + " значение массива случайно равно " + array[i]);
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array[i] = 0;
            }
        }

        // выводим новый массив
        System.out.println("Ваш новый массив: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + " значение массива случайно равно " + array[i]);
        }


    }
}
