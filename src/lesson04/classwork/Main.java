package lesson04.classwork;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String str = "Hello world!";
        System.out.println(str);
        System.out.println(str.length());

        // получаем первый символ строки
        char first_letter = str.charAt(0);
        System.out.println(first_letter);

        // получаем индекс символа
        int wIndex = str.indexOf('w');
        System.out.println(wIndex);

        // substring (int начала, int конца) позволяет получить подстроку (значение между двумя индексами)

        String str_result = str.substring(0,5);
        System.out.println(str_result);
        System.out.println(str.substring(wIndex));

        // проверяем соответствует ли строка заданной
        System.out.println(str_result.equalsIgnoreCase("HELLO"));






    }
}
