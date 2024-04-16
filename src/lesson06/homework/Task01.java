package lesson06.homework;

import java.util.Scanner;

public class Task01
{
    public static void main(String[] args) {

        // body mass index (BMI) Calculator
        System.out.println("Lets calculate your body mass index!");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your weight in (kg): ");
        double weight = scan.nextFloat();
        System.out.println("Enter your height in (cm): ");
        double height = scan.nextFloat()/100;
        double round_index = (double) Math.round((weight / Math.pow(height, 2)) * 100) / 100;

        String message = "Well done! Your BMI is: " + round_index + "\nIt looks like: ";

        // 0-15: анорексия 15-20: недостаточный вес //20-25: нормальный вес //25-30: лишний вес //30+: ожирение

        if (round_index < 15) {
            message += "anorexia";
        } else if (round_index < 20) {
            message += "underweight";
        } else if (round_index < 25) {
            message += "normal weight";
        } else if (round_index < 30) {
            message += "overweight";
        } else {
            message += "obesity";
        }
        System.out.println(message);
    }
}
