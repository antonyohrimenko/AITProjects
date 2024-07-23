package NGlesson38.homework.task01;

//песочница

import NGlesson38.homework.Exceptions.UncheckedCustomException;

public class Main {
    public static void main(String[] args) {

        try {
            SumCalculator.calculateSum(100_000); // тут играемся со значением
        } catch (UncheckedCustomException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

    }
}
