package lesson30.homework.Task01_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Пользователь вводит размер списка и сам список целых чисел.
Удвоить каждое число в списке и умножить его на 2.
Вывести результат в консоль.
 */

    public class Main {

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

            // Запрашиваем размер списка
            System.out.print("Введите размер списка: ");
            int size = scan.nextInt();

            // Создаем список и заполняем его числами, введенными пользователем
            List<Integer> numbers = new ArrayList<>();
            System.out.println("Введите числа:");
            for (int i = 0; i < size; i++) {
                numbers.add(scan.nextInt());
            }

            // Создать новый список для хранения удвоенных значений
            List<Integer> doubledNumbers = doubleAndRepeat(numbers);

            // Выводим результат
            System.out.println("Результат:");
            for (int number : doubledNumbers) {
                System.out.print(number + " ");
            }
        }

        // Метод удвоения и повторения значения
        public static List<Integer> doubleAndRepeat(List<Integer> numbers) {
            List<Integer> result = new ArrayList<>();
            for (int number : numbers) {
                int doubled = number * 2;
                result.add(doubled);
                result.add(doubled);
            }
            return result;
        }
    }
