package lesson09.classwork;

import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {

        // пользователь вводит куча чисел посчитать из сумму

        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int sum = 0;


        do {
            sum += number;
            number = scan.nextInt();
        }
        while (number != 0);
        System.out.println(sum);
    }
}
