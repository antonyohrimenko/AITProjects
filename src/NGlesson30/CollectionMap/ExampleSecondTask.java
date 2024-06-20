package NGlesson30.CollectionMap;

import java.util.HashMap;
import java.util.Map;

public class ExampleSecondTask{

    //Дана строка, найти, сколько раз в строке встречается каждая буква
    public static void main(String[] args) {

        String str = "Белеет парус одинокой" +
                "В тумане моря голубом!.." +
                "Что ищет он в стране далекой?" +
                "Что кинул он в краю родном?.." +
                "Играют волны — ветер свищет," +
                "И мачта гнется и скрыпит…" +
                "Увы! он счастия не ищет" +
                "И не от счастия бежит!" +
                "Под ним струя светлей лазури," +
                "Над ним луч солнца золотой…" +
                "А он, мятежный, просит бури," +
                "Как будто в бурях есть покой!";

        str = str.toLowerCase();
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char symbol = str.charAt(i);

            if (symbol >= 'а' && symbol <= 'я') { // классный пример ограничения
                Integer count = map.get(symbol);

                if (count == null) {
                    map.put(symbol, 1);
                } else {
                    map.put(symbol, count + 1);
                }
            }
        }

        System.out.println(map);
    }
}