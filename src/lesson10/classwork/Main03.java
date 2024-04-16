package lesson10.classwork;

import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {

        int[] array = {17, 5, -6, 0, 1, 8};

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.println("Введите число из массива: ");

        int value = scan.nextInt();
        int index = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                index = i;
                break;
            }

        }
            if (index != -1) {
                System.out.println("Индекс элемента с этим значением = " + index);
            } else {
                System.out.println("В этом массиве нет такого элемента");
            }

        }
}
