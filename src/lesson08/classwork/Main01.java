package lesson08.classwork;

import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {

        // While Loop and for Loop

        Scanner sc = new Scanner(System.in);
        int summa = 0;
        boolean condition = true;

        System.out.println("Please enter integer number (negative number for exit)");

        while (condition) {
            int userNumber = sc.nextInt();
            if (userNumber >= 0) {
                summa = summa + userNumber;
            } else {
                condition = false;
            }
        }
        System.out.println("Сумма всех введенных чисел = " + summa);
    }
}

