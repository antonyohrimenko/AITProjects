package lesson08.classwork;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {

        // печатаем все простые числа от 0 до 100

        System.out.println("Простые числа от 0 до 100:");

        for (int i = 2; i <= 100; i++) {
            boolean isSimple = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isSimple = false;
                    break;
                }
            }

            if (isSimple) {
                System.out.print(i + " ");
            }
        }
    }
    }

