package lesson09.homework;

import java.util.Random;
import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {

        // создаем массив с 10 элементами
        int[] array = new int[10];

        // заполняем массив случайными значениями
        Random rnd = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(100);
            System.out.printf(" " + array[i]);
            // заполнили, протестили - массив рандомный и выводится
        }

        // Запрашиваем у пользователя значение и сравним его с индексом
        Scanner scan = new Scanner(System.in);
        System.out.println("\n Выберите значение из массива:");
        int userNum = scan.nextInt();

        // Ищем индекс первого элемента с выбранным значением
        int index = -1;
        // ставим значение  -1, чтобы потом сравнить на выводе на экран с этим знаничением
        // пустым быть не может, нулем тоже (тк это нулевой элемент массива будет)

        for (int i = 0; i < array.length; i++) {
            if (array[i] == userNum) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("Индекс элемента с этим значением = " + index);
        } else {
            System.out.println("В этом массиве нет такого элемента");
        }
    }
}
