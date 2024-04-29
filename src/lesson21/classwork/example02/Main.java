package lesson21.classwork.example02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        MyArrayList list = new MyArrayList();

        int totalTime = 0;
        int longestIndex = 0;
        int longestTime = 0;
        String item;
        while (true) {
            item = scanner.nextLine();
            if (item.equalsIgnoreCase("end") || item.equalsIgnoreCase("Конец")) {
                break;
            }
            int time = scanner.nextInt();
            scanner.nextLine();
            totalTime += time;
            if (time > longestTime) {
                longestTime = time;
                longestIndex = list.getSize();
            }
            list.add(item + " (" + time + " минут)");
        }

        System.out.println("Общее время: " + totalTime);
        for (int i = 0; i < list.getSize(); i++) {
            System.out.println((i + 1) + ". " + list.get(i));
        }

        System.out.println("Дольше всего займет дело: " + list.get(longestIndex));
    }
}
