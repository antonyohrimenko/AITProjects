package lesson13.homework;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Выберите что хотите первести:");
            System.out.println("1. C -> F");
            System.out.println("2. F -> C");
            System.out.println("3. Выход");

            int userChoice = scan.nextInt();

            if (userChoice == 3) {
                break;
            }

                System.out.println("Введите температуру: ");
                double userTemperature = scan.nextDouble();

            System.out.println(userChoice == 1 ? userTemperature + " градусов по цельсию = " + convertToFahrenheit(userTemperature) + " по фарингейту" : userTemperature + " градусов по фарингейту = " + convertToCelsius(userTemperature) + " по цельсию");
        }
        while (true);
    }

    public static double convertToFahrenheit(double degrees) {
        return degrees * 1.8 + 32;
    }

    public static double convertToCelsius(double degrees) {
        return (degrees - 32) / 1.8;
    }
}
