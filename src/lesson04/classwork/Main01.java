package lesson04.classwork;

import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        // тестируем сканнер

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите как вас зовут? ");
        String name = scan.nextLine();
        System.out.println("Привет " + name + "!" + " Приятно познакомиться =)");
    }
}
