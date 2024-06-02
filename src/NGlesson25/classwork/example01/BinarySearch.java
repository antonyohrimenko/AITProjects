package NGlesson25.classwork.example01;


// изучаем алгорим бинарного поиска
public class BinarySearch {

    public static void main(String[] args) {

        int[] array = {4, 5, 10, 13, 45, 89, 103, 145, 203, 304, 404};

        System.out.println(binarySearch(array, 405));
    }

    public static int binarySearch(int[] array, int number) {

        // нужен алгорим, который постоянно выбирает центральный элемент массива
        // и в зависимости от результата конкретной ячейки убирает из поиска половину массива

        // Очень важно чтобы массив был отсортирован, если он не отсортирован
        // то смысла его применять не особо много, быстрее будет медленным линейным поиском

        int start = 0;
        int finish = array.length - 1;
        int index = -1;


        while (start <= finish) {

            int median = (start + finish) / 2;

            if (array[median] == number) {
                index = median;
                break;
            }

            if (array[median] > number) {
                finish = median - 1;
            }

            if (array[median] < number) {
                start = median + 1;
            }
        }

        return index;
    }
}
