package lesson30.classwork.example02;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main04 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(List.of(4, 54, 25, -2, 10));
        System.out.println(list);

        int oldValue = list.set(2, 10);
        System.out.println(list);
        System.out.println("Old Value of Index 2: " + oldValue);

        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1, o2);
            }
        });
        System.out.println("\n ======== \n");
        System.out.println(list);
    }
}

