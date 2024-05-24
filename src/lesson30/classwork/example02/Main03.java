package lesson30.classwork.example02;

import java.util.ArrayList;
import java.util.List;

public class Main03 {
    public static void main(String[] args) {

        int[] array = {-1, 2, 4, 5, 88};

        List<Integer> list = new ArrayList<>();

        for (int i : array){
            list.add(i);
        }
        list.add(9);
        System.out.println(list);
    }
}
