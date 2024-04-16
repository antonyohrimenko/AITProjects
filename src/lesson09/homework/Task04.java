package lesson09.homework;

import java.util.Random;
import java.util.Scanner;

public class Task04 {
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

        // сделаем все тоже самое как в `Task03, но через метод
        int index = findIndex(array, userNum);

        // вывод к консоль можно тоже в метод засунуть, но не знаю правильно ли его туда добавлять
        // ведь суть метода, чтобы он возвращал значение

        if (index != -1) {
            System.out.println("Индекс элемента с этим значением = " + index);
        } else {
            System.out.println("В этом массиве нет такого элемента");
        }
    }

    // Метод для поиска индекса значения в массиве (метот выносим за мейн)
    public static int findIndex(int[] array, int userNum) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == userNum) {
                return i; // Возвращаем индекс, если найдено значение
            }
        }
        return -1; // Возвращаем -1, если значение не найдено
    }
}
