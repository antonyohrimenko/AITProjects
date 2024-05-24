package lesson30.classwork.example02;

import java.util.ArrayList;
import java.util.List;

public class Main01 {
    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();

        fruits.add("apple");
        fruits.add("grapes");
        fruits.add("orange");
        fruits.add("melone");
        fruits.add("pear");

        for (String s : fruits){
            System.out.println(s);
        }

        System.out.println(fruits);

        fruits.remove("melone");
        System.out.println(fruits);
        fruits.remove(2);
        System.out.println(fruits);
    }
}
