package lesson30.classwork.example02;

import java.util.ArrayList;
import java.util.List;

public class Main02 {
    public static void main(String[] args) {

        List<Integer> list;

       // list = new ArrayList<>(45); // создаем список с размерностью
        list = new ArrayList<>(List.of(1, 2,3 )); // иницаилизируем коллекцией
        list.add(9);
        System.out.println(list);

        // list = List.of(1, 2,3 ); // не изменяемый список нельзя ни добавить ни убавить

    }
}
