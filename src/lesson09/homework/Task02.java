package lesson09.homework;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {


        int sum = 0;
        // Считываем начальное значение, шаг и количество элементов последовательности
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите начальное значение:");
        int start = scanner.nextInt();

        System.out.println("Введите шаг:");
        int step = scanner.nextInt();

        System.out.println("Введите количество элементов последовательности:");
        int count = scanner.nextInt();

        // Создаем массив для хранения последовательности
        int[] sequence = new int[count];

        // Заполняем массив значениями и считаем сразу сумму
        for (int i = 0; i < sequence.length; i++) {
            sequence[i]=start + i* step;
            sum+= sequence[i];
            System.out.println("Значение " + i + " элемента в массиве равно " + sequence[i]);
        }
        System.out.println("Сумма элементов массива: " + sum);
    }
}
