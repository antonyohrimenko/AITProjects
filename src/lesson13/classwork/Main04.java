package lesson13.classwork;

import java.util.Random;

public class Main04 {
    public static void main(String[] args) {

        int number = getRandomNumber(1,100);
        System.out.println(number);
    }

    // метод заполнения рандома с границами значений
    public static int getRandomNumber(int min, int max) {
        Random rnd = new Random();
        return min + rnd.nextInt(max - min + 1);
    }
}
