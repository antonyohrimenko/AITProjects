package lesson14.classwork;

import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {

        int[] array = {17, 5, -6, 0, 1, 8};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println("\nEnter value from array: ");

        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        int index = findIndex(array, value);


        if (index == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Index of value is: " + index);
        }
    }

    // методы пишем тут

    // линейный поиск элемента
public static int findIndex (int [] array, int value){
    for (int i = 0; i < array.length; i++) {
        if (array[i] == value) {
            return i;
        }
    }
    return -1;
}

}
