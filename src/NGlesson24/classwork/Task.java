package NGlesson24.classwork;


// пользователем вводится строка, возьмите 1ый символ строки и
// и последний символы строки. Конкатенируйте их (сложите)
// повторите полученную строку 5 раз.
// Если в строке есть буква "а" замените ее на букву "b"
// оставьте только последние 5 символов и выведите на экран символ под номером 2

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {

        System.out.println("Введите строку");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        String first = string.substring(0, 1);
        String last = string.substring(string.length() - 1);

        String result = first + last;
        System.out.println(result);

        System.out.println(result.repeat(5));

        result = result.replace("a", "b");
        System.out.println(result);

    }

}
