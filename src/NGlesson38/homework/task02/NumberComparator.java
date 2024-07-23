package NGlesson38.homework.task02;

import NGlesson38.homework.Exceptions.CheckedCustomException;

// 2.2 Напишите метод. В него вводится 2 числа. Метод ничего не возвращает,
// но если второе число больше первого, то бросьте проверяемое исключение.


public class NumberComparator {
    public static void compareNumbers(int num1, int num2) throws CheckedCustomException {
        if (num2 > num1) {
            throw new CheckedCustomException("Второе число больше первого: " + num2 + " > " + num1);
        } else {
            System.out.println("Наверное первое число больше или равно второму, а может и нет никто не знает :)");
        }
    }
}
