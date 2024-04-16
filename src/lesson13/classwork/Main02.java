package lesson13.classwork;

import java.util.Random;
import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {

        // бросаем кубик
        Scanner scan = new Scanner(System.in);
        String input;

        do {
            int roll = rollDice();
            System.out.println("Dice roll " + roll);
            input = scan.next();
        }
        while (!input.equals("0"));

    }

    // тут пишем метод
    // создаем метод который кидает кости (1-6) D6

    public static int rollDice() {
        Random rnd = new Random();
        int roll = 1 + rnd.nextInt(6);
        return roll;
        // или return Main04.getRandomNumber(1,6);
    }
}
