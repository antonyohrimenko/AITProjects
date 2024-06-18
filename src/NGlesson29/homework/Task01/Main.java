package NGlesson29.homework.Task01;

/*
    1.0 Вводится 5 чисел. Напишите "Yes", если они не все равны между собой.
    1.1 Нужно использовать Set
    1.2 Запрещено писать в if условие (1 == 2 и 2 == 3 и 3 == 4), contains использовать нельзя
 */

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        System.out.println("Введите 5 чисел через пробел:");
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++){
            set.add(scanner.nextInt());
        }

        System.out.println("Наш сет "+ set);;

        // если все числа равны между собой, то размер сета будет 1
        // (тк он хранит только уникальные значения)

        System.out.println(set.size() !=1 ? "Yes" : "Числа в Set равны между собой");
        scanner.close();
    }
}
