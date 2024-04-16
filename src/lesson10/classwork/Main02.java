package lesson10.classwork;

import java.util.Random;
import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {

        // пользователь вводит размер массива
        // Сгенерировать такого размера из псевдослучайных числел в
        // диапахоне 0 - 100

        System.out.println("Введите размер массива: ");
        Scanner scan = new Scanner(System.in);
        int max_range = scan.nextInt();

        Random rnd = new Random();
        int[] array = new int[max_range];

        for (int i = 0; i < max_range; i++) {

            array[i] = rnd.nextInt(100);
            System.out.println(i + " значение массива случайно равно " + array[i]);
        }


    }
}
