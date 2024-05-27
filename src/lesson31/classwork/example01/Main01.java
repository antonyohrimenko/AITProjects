package lesson31.classwork.example01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;

public class Main01 {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();
        queue.offer("Banana");
        queue.offer("Apple");
        queue.offer("Cherry");
        System.out.println("Poll: " + queue.poll());
        queue.offer("Pear");

        System.out.println("======");
        for (String s : queue) {
            System.out.println(s);
        }
        System.out.println("Queue is empty: " + queue.isEmpty());

    }
}
