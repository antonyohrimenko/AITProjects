package lesson13.homework;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
Написать программу, которая рассчитывает индекс массы тела (ИМТ) и говорит о состоянии веса.
Для этого нужно написать такие методы:
1 Спросить у пользователя его вес в килограммах и рост в сантиметрах (целые числа)
2 Перевести рост в метры (для этого рост в см поделить на 100). Учтите, что результат будет не целым
3 Рассчитать ИМТ по формуле: вес / (рост ^ 2)
4 Вывести результат расчётов в консоль и оценку веса.
 */

public class Task03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double weight = getWeight(scanner);
        double height = getHeight(scanner);
        double bmi = calculateBMI(weight, height);

        printBMIResult(bmi);
    }

    // Метод для получения веса пользователя
    public static int getWeight(Scanner scanner) {
        System.out.println("Enter your weight in kilograms:");
        return scanner.nextInt();
    }

    // Метод для получения роста пользователя и перевода его в метры
    public static double getHeight(Scanner scanner) {
        System.out.println("Enter your height in centimeters:");
        return scanner.nextDouble() / 100;
    }

    // Метод для расчета ИМТ
    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }

    // Метод для вывода результата
    public static void printBMIResult(double bmi) {

        System.out.println("Your BMI is: " + new DecimalFormat("#0.00").format(bmi));
        // читал что лучше форматом пользоваться вот так, чем String.format() типа быстрее раза в 2.
        // как померить я хз =)

        System.out.print("It looks like: ");
        if (bmi < 15) {
            System.out.println("anorexia");
        } else if (bmi < 20) {
            System.out.println("underweight");
        } else if (bmi < 25) {
            System.out.println("normal weight");
        } else if (bmi < 30) {
            System.out.println("overweight");
        } else {
            System.out.println("obesity");
        }
    }
}

