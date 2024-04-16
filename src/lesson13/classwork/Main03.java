package lesson13.classwork;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your distance in KM: ");
        double distance = scan.nextDouble();
        double distance_miles = kmToMile(distance);
        System.out.println(distance_miles);
    }

    // написать программу, которая переводит километры в мили
    // 0,6213 - миль в 1 км

    public static double kmToMile (double km){
        return km * 0.6213;
    }
}
