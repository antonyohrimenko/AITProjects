package lesson31.Task03;

import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {

        // 567432 -> 5+6+7+4+3+2 -> 27

        System.out.println("Enter value and get sum");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            sum+= str.charAt(i) - '0';
        }

        System.out.println(sum);
    }
}
