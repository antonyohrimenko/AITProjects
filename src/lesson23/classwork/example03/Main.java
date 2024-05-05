package lesson23.classwork.example03;

public class Main {
    public static void main(String[] args) {

        int[] arr = {10, 7, 1, 4, 7, 4, 11};

// Предположим, что нулевой элемент максимальный
        int max = arr[0];

// В цикле начинаем с первой ячейки
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max); // => 11
    }
}
