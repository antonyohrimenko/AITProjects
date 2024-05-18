package lesson29.classwork.example03;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        MyArrayList<String> list = new MyArrayList<>();

        list.add("Hello");
        list.add("World");
        list.add("Java");

        for (int i = 0; i < list.getSize(); i++) {
            String elem = list.get(i);
            System.out.println(elem);
        }
        System.out.println("\n ====== \n");

        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("\n ====== \n");

        MyArrayList<Integer> list1 = new MyArrayList<>();
        list1.add(5);
        list1.add(Integer.parseInt("123"));
        list1.add(Integer.valueOf(5896));

        for (int i : list1) {
            System.out.println(i);
        }
    }
}
