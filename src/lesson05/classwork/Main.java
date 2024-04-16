package lesson05.classwork;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // пользователь вводит 3 числа (число нижняя и верхняя граница диапазона) + одно проверочное
        // вывести на экран true если число будет в диапазоне

        Scanner scan = new Scanner(System.in);

        System.out.println("Введите нижнюю границу диапазона: ");
        int first_number = scan.nextInt();
        System.out.println("Введите верхнюю границу диапазона: ");
        int second_number = scan.nextInt();
        System.out.println("Введите ваше число: ");
        int private_number = scan.nextInt();


        if (private_number >= first_number &&  private_number <=second_number)
        {
            System.out.println("Поздравляю, ваше число " + private_number +  " в границах диапазона!");
        }
        else
            System.out.println("Ваше число " + private_number +  " НЕ ПОПАЛО в границы диапазона");

        //boolean b = 5 == 3;
        // System.out.println(b);
    }
}
