package NGlesson30.CollectionMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExampleThirdTask {
    public static void main(String[] args) {

        Map<String, List<String>> map = new HashMap<>();

        List<String> list = new ArrayList<>();
        list.add("Санкт-Петербург");
        list.add("Баку");
        list.add("Каракас");
        list.add("Новгород");
        list.add("Москва");

        map.put("Даниил", list);

        List <String> cities = map.get("Даниил"); // обьект тотже переменная разная
        cities.add("Нижний Новгород");

        System.out.println(map);




    }
}
