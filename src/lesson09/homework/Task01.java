package lesson09.homework;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int userNumber;
        int counter = 0;

        do {
            System.out.println("Введите натуральное число:");
            userNumber = scan.nextInt();
            counter++;
        }
        while (userNumber <= 0);
        System.out.println("Вы ввели " + userNumber + ". У вас получилось это сделать с " + counter + " попытки. Спасибо!");
    }
}
