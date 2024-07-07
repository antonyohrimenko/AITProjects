package NGlesson33.homework;


/*
Есть список строк
отсеять строки, больше 15 символов
Найти самую большую строку
 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Task02 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        //добавим 5 каких-то строк в список разной длинны
        list.add("Я 15 символов");
        list.add("Я бесполезная строка");
        list.add("Я очень простая строка");
        list.add("Я пытаюсь быть какой-то строкой");
        list.add("Я бы хотел быть самой длинной строкой");
        list.add("Мне кажется я самая длинная строка в этом списке.");


        // добавляем стрим
       List<String> result = list.stream()
               // у меня все 5 строк более 15 символов, для наглядности
               // что фильтр работает, сделаем условие 30
               .filter(str -> str.length() < 30)
               .toList();
        System.out.println(result);

        // для наглядности выделим в отдельный блок нахождение самой длинной из отфильтрованых оставшихся строк
        Optional <String> longestString = result.stream()
                .max(Comparator.comparingInt(String::length));

        longestString.ifPresent(str -> System.out.println("Самая длинная строка: " + str + "\n" + "Размер строки: " + str.length()));
    }
}
