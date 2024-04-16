package lesson12.classwork;

import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] answer = new String[10];
        System.out.println("Введите список дел: ");
        String item;
        int count = 0;

        for (int i = 0; i < answer.length; i++) {
            item = scan.nextLine();
            if (item.equalsIgnoreCase("конец") || item.equalsIgnoreCase("end")) {
                break;
            }
            count++;
            answer[i] = item;

        }

        // выводим значения
        // System.out.println(count);

        for (int i = 0; i < count; i++) {
            System.out.println(i + 1 + "." + answer[i]);
        }
    }
}
