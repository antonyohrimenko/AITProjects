package NGlesson30.CollectionMap;

import java.util.HashMap;
import java.util.Map;

public class MainMapExamples {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("Сидоров", 5); // ключ в мапе уникальный. Двух ключей быть не может
        map.put("Петров", 2);
        map.put("Сидоров", 10); // перетрет значние

        System.out.println(map);

        System.out.println(map.get("Сидоров"));
        System.out.println(map.get("Сидорова")); // нет ключа поэтому null


    }
}
