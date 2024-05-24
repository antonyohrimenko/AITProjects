package lesson30.classwork.example03;

import java.util.ArrayList;
import java.util.List;

public class Main02 {

    public static int[] removeSmallest(int[] numbers) {

        List<Integer> list = new ArrayList<>();
        for (int i : numbers) {
            list.add(i);
        }

        Integer min = Integer.MAX_VALUE;

        for (int i : list) {
            if (min > i) {
                min = i;
            }
        }
        list.remove(min);

        int[] res = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }

        return res;
    }

    public static void main(String[] args) {


    }
}
