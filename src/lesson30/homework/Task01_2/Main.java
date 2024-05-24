package lesson30.homework.Task01_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;


public class Main {

    /*
Сгенерировать список из 10 случайных значений от 1 до 100.
Вывести этот список.
Потом развернуть этот список в обратном порядке.
Вывести список еще раз.
Важно: вы должны именно развернуть исходный список, а не просто вывести его в обратном порядке
     */

    public static void main(String[] args) {

        // Генерируем список из 10 случайных значений от 1 до 100
        List<Integer> randomNumbers = generateRandomList(10, 1, 100);

        // Выводим исходный список
        System.out.println("Исходный список:");
        printList(randomNumbers);

        // Разворот списка
        reverseList(randomNumbers);

        // Выводим развернутый список
        System.out.println("Развернутый список:");
        printList(randomNumbers);
    }


    // генерируем случайный список
    public static List<Integer> generateRandomList(int size, int min, int max) {
        List<Integer> list = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < size; i++) {
            list.add(rnd.nextInt(max - min + 1) + min);
        }
        return list;
    }

    // разворот поворот приворот =)
    public static void reverseList(List<Integer> list) {
        Collections.reverse(list);
    }

    // для эксперимена вывод напишем тоже методом
    public static void printList(List<Integer> list) {
        for (int number : list) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}

