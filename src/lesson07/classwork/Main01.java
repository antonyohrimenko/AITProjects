package lesson07.classwork;

import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {

        // программа которая превращает введенную цифру в словестную форму
        // 1 - one; 2 - two

        System.out.println("Введите цифру: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String answer;

        switch (n) {
            case 0:
                answer = "zero";
                break;
            case 1:
                answer = "one";
                break;
            case 2:
                answer = "two";
                break;
            case 3:
                answer = "three";
                break;
            case 4:
                answer = "four";
                break;
            case 5:
                answer = "five";
                break;
            case 6:
                answer = "six";
                break;
            case 7:
                answer = "seven";
                break;
            case 8:
                answer = "eight";
                break;
            case 9:
                answer = "nine";
                break;
            default:
                answer = "undefined";
        }
        System.out.println(answer);
    }
}

