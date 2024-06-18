package NGlesson29.homework.Task02;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
    2. Вводится день недели. Напишите тип это дня (выходной или рабочий). Используйте для этого set.
    2.1 Если такого дня не существует - напишите "Ошибка".
 */
public class Main {
    public static void main(String[] args) {

        Set<String> validDays = new HashSet<>();

        // заполняем Set значениями
        for (Day day : Day.values()) {
            validDays.add(day.name());
        }

        // вводим день недели
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter day of week :");
        String inputDay = scanner.nextLine().trim().toUpperCase();

        // Проверяем, является ли введенный день допустимым
        if (validDays.contains(inputDay)) {
            Day day = Day.valueOf(inputDay);
            System.out.println(inputDay + " is a " + day.getType());
        } else {
            System.out.println("Wrong day, dude!");
        }

        scanner.close();
    }
}
