package lesson08.homework;

import java.util.Scanner;

public class Task01 {

    /**
     *
     * Подсчитать сумму всех четных чисел от 0 до N при том что N вводится пользователем
     */

    public static void main(String[] args) {
        System.out.println("Введите верхний диапазон: ");
        Scanner scan = new Scanner(System.in);
        int userNum = scan.nextInt();
        int sum = 0;

        for (int i = 0; i <= userNum; i++) {
            if (i % 2 ==0) {
                sum+= i;
            }
        }
        System.out.println("Сумма всех четных числе в диапазоне от 0 до " + userNum + " = " + sum);
    }
}
