package lesson05.homework;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {

        // Напишите программу, которая запросит ввести ваш возраст,
        // и напишет, кем вы являетесь: ребенком, подростком, взрослым либо пожилым человеком.

        System.out.println("Enter your AGE to know who are you: ");
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();

        // ребенок 0-13 лет, подросток 13-21 год, взрослый 21-65, пожилой 65+

        // без использования логических операторов

        if (age < 13) {
            System.out.println("You are Child, try to grow-up!");
        } else if (age < 21) {
            System.out.println("You are Teenager!");
        } else if (age < 65) {
            System.out.println("You are Adult!");
        } else {
            System.out.println("You are Old Man, become your pension taxes!");
        }
        }
    }


