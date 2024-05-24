package lesson30.homework.Task02;

import java.util.*;

public class Main {

    // напишем метод для генерации случайного числа в диапазоне

    private static int rnd(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

    public static void main(String[] args) {


        List<Kettlebell> list = new ArrayList<>();
        int numberOfKettlebells = rnd(5, 20);

        Random rnd = new Random();

        // Добавляем случайное количество гирь со случайным весом в список
        for (int i = 0; i < numberOfKettlebells; i++) {
            double weight = Kettlebell.generateRandomWeight();
            Materials material = rnd.nextBoolean() ? Materials.STEAL : Materials.CAST_IRON;
            Colours colour = rnd.nextBoolean() ? Colours.BLACK : Colours.RED;
            list.add(new Kettlebell(weight, material, colour));
        }

        // ну вроде все заполнили - выводим список в консоль
        System.out.println("\n === Список гирь ДО сортировки:");
        System.out.println(" === Кол-во гирь: " + numberOfKettlebells + " ===\n");
        for (Kettlebell s : list) {
            System.out.println(s);
        }

        // выводится :) теперь сортируем его по весу, по-царски

        // Сортируем список
        Collections.sort(list);

        // Выводим список после сортировки
        System.out.println("\n === Список гирь ПОСЛЕ сортировки:");
        System.out.println(" === Кол-во гирь: " + numberOfKettlebells + " ===\n");
        for (Kettlebell kettlebell : list) {
            System.out.println(kettlebell);
        }

        // работает :)
    }
}

