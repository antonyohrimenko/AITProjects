package NGlesson25.homework;

import java.util.Arrays;
import java.util.Scanner;

/*
//1. Пользователь вводит 10 чисел с консоли
//Соберите их в массив и отсортируйте (любым способом, кроме заложенных в джава)
/ /Бинарным поиском найдите число в этом массиве, которое пользователь введет 11ым
//Вывести результат (индекс) на экран
/ /Усложнения:
//1. Вводится не 10 чисел, а строка содержащая числа, записанные через пробелы
//2. Бинарный поиск обязательно должен быть рекурсивным
 */

public class Task01 {
    public static void main(String[] args) {

        System.out.println("Введите последовательность чисел через пробел: ");
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");

        // преобразуем нашу строку в массив интов.
        // можно и в сортировку этот блок добавить. ХЗ как лучше
        // чтобы у нас пузырек сортировал массивы на основе строки

        int[] swappedToIntArray = new int[input.length];
        for (int i = 0; i < swappedToIntArray.length; i++) {
            swappedToIntArray[i] = Integer.parseInt(input[i]);
        }

        System.out.println("Отсортированый массив: ");
        System.out.println(Arrays.toString(bubbleSort(swappedToIntArray)));

        System.out.println("Введите число из массива и узнайте индекс: ");
        System.out.println("Индекс вашего элемента в массиве: " + binarySearch(swappedToIntArray, scanner.nextInt(), 0, swappedToIntArray.length));
        scanner.close();
    }

    // метод сортировки пузырьком
    private static int[] bubbleSort(int[] array) {

        for (int j = 0; j < array.length - 1; j++) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
        return array;
    }

    // метод бинарного поиска элемента в массиве
    private static int binarySearch(int[] array, int targetIndex, int start, int finish) {

            int index = -1;
            int median = (start + finish) / 2;

            if (array[median] == targetIndex) {
                index = median;
            }

            if (start == finish && array[median] != targetIndex) {
                return -1;
            }

            if (array[median] > targetIndex) {
                index = binarySearch(array, targetIndex, start, median - 1);
            }

            if (array[median] < targetIndex) {
                index = binarySearch(array, targetIndex, median + 1, finish);
            }

            return index;
        }
}

