package lesson12.classwork;

import java.util.Random;
import java.util.Scanner;

public class Main04 {
    public static void main(String[] args) {

        // угадавай число. Где нужно угадывать число от 1 до 10
        // программа загадывает число, пользователь пробует угадать
        // если число угадано - программа поздравляет с выигрышем и заканчивает
        // если не угадано - программа будет говорить - попробовать еще раз, меньше или больше
        // подсчитать кол-во попыток угадывания

        Random rnd = new Random();
        int hide_num = rnd.nextInt(10);
        System.out.println(hide_num);

        Scanner scan = new Scanner(System.in);
        int attemps = 0;

        System.out.println("Введите загаданное число от 1 до 10");

        while (true){

            int guess = scan.nextInt();
            attemps++;

            if (guess == hide_num) {
                System.out.println("Поздравляем! Вы выиграли!");
                System.out.println("Колличество попыток равно " + attemps);
                break;

            } else if (guess < hide_num) {
                System.out.println("Близко но нет, загаданное число больше");
            }
            else {
                System.out.println("Близко но нет, загаданное число меньше");
            }
        }
    }
}
