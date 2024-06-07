package NGlesson27.homework;

import java.util.Arrays;
import java.util.Scanner;

public class CorrectParenthesis_v2 {
    public static void main(String[] args) {

        System.out.println("Введите строку с круглыми скобками");
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        char[] result = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            result[i] = str.charAt(i);
        }
        // выведем для проверки
        System.out.println(Arrays.toString(result));


        int count = 0;
        boolean isCorrect = false;

        for (int i = 0; i < result.length; i++) {
            if (result[i] == '(') {
                count++;
            }
            if (result[i] == ')') {
                count--;
            }
            if (count < 0) {
                break;
            }
        }

        if (count == 0){
            isCorrect = true;
        }

        System.out.println("Скобки расставлены: " + isCorrect);
    }
}
