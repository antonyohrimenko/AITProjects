package NGlesson33.classwork;

import java.util.ArrayList;
import java.util.List;

public class SecondTaskStream {
    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();

        // найдите имена которые имеют четное кол-во букв и выведите их длину

        strings.add("Гиляна");
        strings.add("Владимир");
        strings.add("Надежда");
        strings.add("Умут");

        List<Integer> result = strings.stream()
                .map(str -> str.length())
                .filter(x -> x % 2 == 0)
                .toList();

        System.out.println(result);

        // найти имена у которых буквы четные

        List<String> names =  strings.stream()
                .filter(str -> str.length() % 2 == 0)
                .toList();

        System.out.println(names);
    }
}
