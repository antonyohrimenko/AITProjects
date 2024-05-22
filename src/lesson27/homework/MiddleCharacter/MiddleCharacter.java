package lesson27.homework.MiddleCharacter;

public class MiddleCharacter {

/*
DESCRIPTION:
You are going to be given a word. Your job is to return the middle character of the word.
If the word's length is odd, return the middle character.
If the word's length is even, return the middle 2 characters.
 */

    public static String getMiddle(String word) {
        int length = word.length();
        int middle = length / 2;

        if (length % 2 == 0) {
            // Длина четная, возвращаем 2 средних символа
            return word.substring(middle - 1, middle + 1);
        } else {
            // Длина нечетная, возвращаем средний символ
            return word.substring(middle, middle + 1);
        }
    }

    public static void main(String[] args) {
        // Примеры использования метода
        System.out.println(getMiddle("test"));    // "es"
        System.out.println(getMiddle("testing")); // "t"
        System.out.println(getMiddle("middle"));  // "dd"
        System.out.println(getMiddle("A"));       // "A"
    }
}

