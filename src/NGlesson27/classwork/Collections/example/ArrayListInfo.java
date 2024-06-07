package NGlesson27.classwork.Collections.example;

import java.util.Arrays;
import java.util.List;

public class ArrayListInfo {
    public static void main(String[] args) {

        int [] array = new int [10];
        System.out.println(Arrays.toString(array));

       List <Integer> list = new java.util.ArrayList<>(); // реализация интерфейса List
        System.out.println(list.size());
        System.out.println("====");
        list.add(1); // добавление элемента
        System.out.println(list.size());
        list.clear(); // очистили
        list.add(3);
        list.set(0, 56); // вставили на 0 ячейку значение 56

        System.out.println(list.contains(56)); // есть ли обьект со значением 56
        System.out.println(list);

        list.remove(0); // удалили элемент по индексу 0
        System.out.println(list);






    }
}
