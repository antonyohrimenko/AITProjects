package lesson10.homework;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {

        /*
Пользователь вводит размер массива и сам массив целых чисел.
Удвоить каждое число и вывести результат в консоль.

Доп. задание:
Сделать также чтобы каждого элемента было в два раза больше
Т.е. вывод будет 2 2 6 6 10 10 14 14 18 18
Важно: Именно сделать чтобы так было в массиве, а не просто выводить по два раза
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int array_size = scan.nextInt();
        int[] array = new int[array_size];

        System.out.println("Заполните массив целыми числами: ");

        // заполняем массив значениями пользователя
        for (int i = 0; i < array_size; i++) {
            int userNumbers = scan.nextInt();
            array[i] = userNumbers;
        }
        System.out.println("Спасибо. Массив заполнен!");

        // выводим удвоеный массив c числами пользователя на экран
        // именно выводим, значения внутри массива мы не трогаем

        System.out.println("Массив с удвоеными значениями: ");
        for (int i = 0; i < array_size; i++) {
            System.out.print(array[i] * 2 + " ");
        }

        // делаем так, чтобы каждого элемента исходного массива было в 2 раза больше

        int[] doubled_array = new int[array_size * 2];

        // заполняем задвоеными значениями
        // раз в примере мы удваиваем и значения - удвоим и тут

        for (int i = 0; i < array.length; i++) {
            doubled_array[i * 2] = array[i] * 2;
            doubled_array[i * 2 + 1] = array[i] * 2;
        }

        // выводим в консоль новый массив
        // ну и для красоты выведем числа через запятую

        System.out.println(" ");

        for (int i = 0; i < doubled_array.length; i++) {
            if (i == doubled_array.length - 1) {
                System.out.print(doubled_array[i]);
            } else {
                System.out.print(doubled_array[i] + ", ");
            }
        }
    }
}

