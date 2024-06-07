package NGlesson27.homework;

import java.util.Arrays;
import java.util.Scanner;

public class Parenthesis {

    public static void main(String[] args) {

        System.out.println("Введите строку с круглыми скобками");
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        char[] result = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            result[i] = str.charAt(i);
        }

        System.out.println(Arrays.toString(result));
        boolean isCorrect = false;
        int countOpenBrace = 0;
        int countCloseBrace = 0;


        for (int i = 0; i < result.length; i++) {

            if (result[i] == '('){
                countOpenBrace++;
            }

            if (result[i] == ')'){
                countCloseBrace++;
            }

            if (result.length % 2 != 0 || result[0] == ')' || result[result.length - 1] == '(' || countCloseBrace > countOpenBrace) {
                isCorrect = false;
                break;
            }

            if (countOpenBrace == countCloseBrace){
                isCorrect = true;
            }
        }

        System.out.println("Скобки расставлены: " + isCorrect);


    }
}
