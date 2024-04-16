package lesson07.homework;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
/*
        Пользователь вводит номер месяца, и получает на вывод название этого месяца
        Например, если введено 3, программа должна вывести "Март" (можно и на англ)
 */
        System.out.println("Введите номер для месяца: ");
        int month = new Scanner(System.in).nextInt();
        String answer = month + " - это месяц ";
        switch (month) {
            case 1:
                answer += "Январь";
                break;
            case 2:
                answer += "Февраль";
                break;
            case 3:
                answer += "Март";
                break;
            case 4:
                answer += "Апрель";
                break;
            case 5:
                answer += "Май";
                break;
            case 6:
                answer += "Июнь";
                break;
            case 7:
                answer += "Июль";
                break;
            case 8:
                answer += "Август";
                break;
            case 9:
                answer += "Сертябрь";
                break;
            case 10:
                answer += "Октябрь";
                break;
            case 11:
                answer += "Ноябрь";
                break;
            case 12:
                answer += "Декабрь";
                break;
        }
        System.out.println(answer);
    }
}
