package lesson09.classwork;

import java.util.Scanner;

public class Main05 {
    public static void main(String[] args) {

        // Массивы

        // инициализация
        //  int [] array = {1,2,3,4,5};

        // создание пустого массива
        // int[] array = new int[4];

        // заполнить массив значениями степеней двойки

        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int)Math.pow(2,i);
            System.out.println(array[i]);
        }

    }
}
