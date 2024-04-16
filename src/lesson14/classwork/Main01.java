package lesson14.classwork;

import java.util.Random;

public class Main01 {
    public static void main(String[] args) {

        // создаем массив через метод и заполняем его значениями
        int array [] = generateRandomArray(1,100,10);
        printArray(array); // выводим массив через метод
        reverseArray(array);  // выводим развернутый массив
        printArray(array); // выводим массив через метод
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // метод генерации массива случайными числами
    public static int [] generateRandomArray (int min, int max, int size){
        Random random = new Random();
        int[] array = new int[size];

        // заполняем массив случайными числами
        for (int i = 0; i < array.length; i++) {
            array[i] = min + random.nextInt(max - min + 1);
        }
        return array;
    }

    // разворачиваем массив через метод
    public static void reverseArray(int [] array){
        int reversedArray [] = new int [array.length];
        for (int i = 0; i < reversedArray.length; i++) {
            reversedArray[i] = array[reversedArray.length - i - 1];
        }
        for (int i =0; i < array.length; i++){
            array[i] = reversedArray[i];
        }
    }

}