package lesson07.classwork;

import java.util.Scanner;

public class Main03 {

    public static void main(String[] args) {

        System.out.println("Введите номер месяца: ");
        int month = new Scanner(System.in).nextInt();
        int days = 0;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
            case 11:
                days = 31;
                break;
            case 4:
            case 6:
            case 8:
            case 10:
            case 12:
                days = 30;
                break;
            case 2:
                days = 28;
        }
        System.out.println(days);
    }
}
