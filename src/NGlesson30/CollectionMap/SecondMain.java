package NGlesson30.CollectionMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SecondMain {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        map.put("Сидоров", 5); // ключ в мапе уникальный. Двух ключей быть не может
        map.put("Петров", 2);
        map.put("Иванов", 10); // перетрет значние

        Set<String> set = map.keySet(); // ключи получаетм
        System.out.println(set);

        for (String string : set){
           Integer a = map.get(string); // получаем значение
            System.out.println(a);
        }

        System.out.println(map.values());


        // проход по всем записям мапы (обьединение ключа и значения)
        for (Map.Entry<String, Integer> stringIntegerEntry : map.entrySet()) {

            System.out.println(stringIntegerEntry.getKey());
            System.out.println(stringIntegerEntry.getValue());
        }



    }
}
