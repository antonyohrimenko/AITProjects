package NGlesson30.CollectionMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ExampleFirstTask {
    public static void main(String[] args) {

        // есть некоторое кол-во ученых
        // каждый вводит свое имя и температуру которую ему удалось замерить
        // найдите наибольшую температуру и назовите человека который ее записал

        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();

        while (true){
            String string = scanner.nextLine();

            if (string.equals("exit")){
                break;
            }

            String [] array = string.split(" ");
            String name = array[0];
            int temperature = Integer.parseInt(array[1]);
            map.put(name, temperature);

        }
        System.out.println(map);

        int max = Integer.MIN_VALUE;
        String nameOfMaxValue = null;


        // поиск самого большого элемента (линейный поиск)
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max){
                max = entry.getValue();
                nameOfMaxValue = entry.getKey();
            }
        }

        System.out.println(max);
        System.out.println(nameOfMaxValue);
    }
}
