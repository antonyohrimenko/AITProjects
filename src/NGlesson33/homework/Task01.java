package NGlesson33.homework;

/*
//Есть список чисел (заполнить как угодно)
//К каждому числу добавить 15
//Оставить числа, большие 50
//Найти сумму чисел
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

public class Task01 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        Random random = new Random();

        // заполним лист 10 случайными числами
        while (list.size() < 10) {
            list.add(random.nextInt(100));
        }

        // проверим чем заполнился лист
        System.out.println("Исходный список чисел: " + list);

        // запустим наш "конвеер" и произведем операции
        List<Integer> result = list.stream()
                .map(x -> x + 15)
                .filter(x -> x > 50)
                .toList(); // терминальный

        // выведем результат всех операций
        System.out.println("Список после операций над ним: " + result);


        //для наглядности сделаем еще один стрим, чтобы найти сумму
        Optional<Integer> sum = result.stream()
                .reduce((x, y) -> x + y); // терминальный

        System.out.println("Сумма элементов нового листа: " + sum.get());

    }
}
