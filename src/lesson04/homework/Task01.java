package lesson04.homework;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {

        System.out.println("Введите вашу фактическую прибыль за месяц: ");
        Scanner scan = new Scanner(System.in);
        double income = scan.nextDouble();

        double tax_pens = income/100*3;
        double tax_income = income/100*15;

       System.out.println("Налог в пенсионных фонд: " + tax_pens);
       System.out.println("Налог на прибыль: " + tax_income);
       System.out.println("Ваша чистая прибыль составит: " + (income-tax_pens-tax_income));



    }
}
