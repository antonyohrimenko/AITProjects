package lesson05.homework;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {

        /*
      Теперь если вы зарабатываете больше 20000 в месяц, вы должны заплатить 22% налога,
      больше 10000 18% налога и если меньше 10000 - 13% налога.
         */

        System.out.println("Enter your total monthly INCOME: ");
        Scanner scan = new Scanner(System.in);
        double income = scan.nextDouble();

        // так как нет понимания какой именно налог увеличивается прогрессивно от суммы
        // пенсионный или подоходный, сделаем единую переменную для налога

        double total_tax = 0;

        if (income >= 20000) {
            total_tax = income * 0.22;
        } else if (income >= 10000) {
            total_tax = income * 0.18;
        } else {
            total_tax = income * 0.13;
        }
        System.out.println("Your TOTAL Taxes are: " + total_tax);
        System.out.println("Your NET profit is: " + (income - total_tax));
    }
}

