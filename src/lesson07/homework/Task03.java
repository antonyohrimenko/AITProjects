package lesson07.homework;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {

        // существует ли треугольник + проверить какой он
        // Острый, тупой, равнобедренный, прямоугольный.

        System.out.println("Введите длину стороны A: ");
        int a = new Scanner(System.in).nextInt();
        System.out.println("Введите длину стороны B: ");
        int b = new Scanner(System.in).nextInt();
        System.out.println("Введите длину стороны C: ");
        int c = new Scanner(System.in).nextInt();
        String answer = "";

        if ((a < b + c) && (b < a + c) && (c < a + b)) {
            answer += "Треугольник существует. ";
            if (a == b || a == c || b == c) {
                answer += "Он также является Равнобедренным.";
            } else if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
                answer += "Он также является Прямоугольным.";
            } else if (a * a + b * b > c * c && a * a + c * c > b * b && b * b + c * c > a * a) {
                answer += "Он также является Остроугольным.";
            } else if (a * a + b * b < c * c || a * a + c * c < b * b || b * b + c * c < a * a) {
                answer += "Он также является Тупоугольным.";
            }
        } else {
            answer += "Треугольник не существует. ";
        }
        System.out.println(answer);
    }
}
