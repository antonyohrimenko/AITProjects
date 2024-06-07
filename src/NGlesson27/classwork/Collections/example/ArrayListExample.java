package NGlesson27.classwork.Collections.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {

        // Подряд вводятся оценки студентов по 100 бальной системе
        // кол-во оценток не ограничено, но когда введется значение -1  = конец записи
        // найдите самую низкую оценку

        List<Integer> marks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int value = scanner.nextInt();
            if (value == -1) {
                break;
            }
            marks.add(value);
        }

        System.out.println(marks); // для проверки выведем массив


        // линейный поиск

        int min = marks.get(0);

        for (int i = 0; i < marks.size(); i++) {
            int element = marks.get(i);
            if (element < min) {
                min = element;
            }
        }

        System.out.println(min);


    }
}
