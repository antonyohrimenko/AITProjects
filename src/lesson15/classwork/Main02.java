package lesson15.classwork;


public class Main02 {
    public static void main(String[] args) {

    }


    // пишем перегрузку методов суммы элементов массива
    // перегрузка это когда внутри одного метода мы вы вызываем другой с таким же названием

    public static int sum(int[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result += array[i];
        }
        return result;
    }

    public static int sum(int[] array, int from, int to) {
        int result = 0;
        for (int i = from; i < to; i++) {
            result += array[i];
        }
        return result;
    }
}
