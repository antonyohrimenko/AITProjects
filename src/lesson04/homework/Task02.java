package lesson04.homework;

import java.util.Scanner;
import java.math.*;

public class Task02 {
    public static void main(String[] args) {

        // Вычисляем индекс массы тела
        // ИМТ = вес / (рост^2)

        System.out.println("Расчет ИМТ (индекса массы тела)");
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите свой вес в килограммах: ");
        double weight = scan.nextFloat();
        System.out.println("Введите свой рост в сантиметрах: ");
        // превращаем сантиметры в метры
        double height = scan.nextFloat()/100;

        double imt = weight / Math.pow(height, 2);
        System.out.println("Ваш индекс массы тела равен: " + imt);

        // тест округления значения, умножаем на 100 и округляем до ближайшего
        // целого числа. Потом делим на 100 и получаем 2 знака
        double test_round_imt = (double) Math.round(imt * 100) / 100;
        System.out.println("Ваш индекс массы тела равен: " + test_round_imt);



    }
}
