package lesson09.classwork;

import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {

        int sum = 0;
        int userNumber = new Scanner(System.in).nextInt();
        int counter = 0;

        while (counter <= userNumber) {
            if (counter % 2 == 0) {
                sum += counter;
                counter++;
            } else {
                counter++;
            }

        }
        System.out.println(sum);
    }
}
