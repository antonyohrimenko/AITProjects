package NGlesson38.homework.task02;
import NGlesson38.homework.Exceptions.CheckedCustomException;

public class Main {

    // но если второе число больше первого, то бросьте проверяемое исключение.

    public static void main(String[] args) {

        try {
            NumberComparator.compareNumbers(10, 5);  // тут играемся со значениями
        } catch (CheckedCustomException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
