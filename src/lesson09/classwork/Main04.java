package lesson09.classwork;

import java.util.Scanner;
import java.math.*;

public class Main04 {
    public static void main(String[] args) {

        // вывести первые N чисел степеней двойки
        // оч странное условие задачи =) сомнительно, но ОКЭЙ

        System.out.println("Введите число: ");
        Scanner scan = new Scanner(System.in);
        int userNum = scan.nextInt();

        for (int i = 0; i < userNum; i++) {
            System.out.println((int)Math.pow(2,i));
        }
    }


}
