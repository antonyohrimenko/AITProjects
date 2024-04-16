package lesson05.classwork;

import java.util.Scanner;

public class Task_additional {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scan.nextInt();

        if (age < 13)
        {
            System.out.println("You are too young! When your are 13 :) Newbie");
        }
        else
        {
            System.out.println("Welcome!");
            System.out.println("Enter your Login: ");

            String login = scan.next();

            System.out.println("Enter your Password: ");
            String password = scan.next();
            int length = password.length();
            String hide_password = "*".repeat(length);

            System.out.println("Successful registration!");
            System.out.println("Your Login: " + login);
           // System.out.println("Your Password: " + password);
            System.out.println("Your Hide_Password: " + hide_password);

        }


    }
}
