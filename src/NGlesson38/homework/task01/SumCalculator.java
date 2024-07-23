package NGlesson38.homework.task01;

// 2.1. Напишите метод. В него вводится целое число - он выводит сумму всех чисел от 1 до этого числа.
// Если сумма вышла больше 10_000, то бросьте непроверяемое исключение.

import NGlesson38.homework.Exceptions.UncheckedCustomException;

public class SumCalculator {
    public static void calculateSum(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        if (sum > 10000) {
            throw new UncheckedCustomException("Сумма чисел превышает 10 000. Уменьшите верхнюю границу");
        } else {
            System.out.println("Сумма всех чисел от 1 до " + number + " равна " + sum);
        }
    }
}