package NGlesson30.homework;

// 1. Пользователи вводят поисковые запросы (просто строка в консоли),
// 2. В ответ пользователю напишите, сколько раз такая строка уже искалась другими пользователями
// 2.1 Если строка искалась более 100 раз, то дальнейшее количество попыток поиска не учитывается
// (значение замирает на 100)

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        SearchTracker searchTracker = new SearchTracker();

        while (true) {
            System.out.println("Введите поисковый запрос (или 'exit' для выхода):");
            String query = scanner.nextLine();

            if (query.equalsIgnoreCase("exit")) {
                break;
            }

            int count = searchTracker.addSearchQuery(query);
            System.out.println("Этот запрос уже искался " + count + " раз(а)");
        }
        scanner.close();
    }
    }
