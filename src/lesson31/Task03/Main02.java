package lesson31.Task03;

import java.sql.Array;
import java.util.Arrays;
import java.util.Random;

public class Main02 {

    /*
    Создать массив целых чисел произвольной длины от 5 до 15.
     Заполнить массив случайными значениями от -50 до 50.
Вывести на экран:
Минимальное значение в массиве
Максимальное значение в массиве
Среднее арифметическое всех значений в массиве
     */

    public static void main(String[] args) {

        Random rnd = new Random();
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(50) - 50;
        }

        System.out.println(Arrays.toString(array));


    }
}
