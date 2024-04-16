package lesson09.classwork;

import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {

        // пользователь вводит куча чисел посчитать из сумму

        int number = new Scanner(System.in).nextInt();
        int sum = 0;


        while (number!=0){
        sum+=number;
        number = new Scanner(System.in).nextInt();
        }
        System.out.println(sum);
    }
}
