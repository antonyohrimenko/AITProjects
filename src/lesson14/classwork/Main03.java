package lesson14.classwork;

/*
 разработать игру виселица =)
  разбиваем на подзадачи

 1) Печатать слово с отгаданными буквами
 2) Где-то взять слово (массив со словами)
 3) Реализовать ввод буквы
 4) Подсчет, отслеживание выигрыша и проигрыша (терминальная стадия)
 5) Подсчет попыток (всего есть 7 попыток)
 6) Выполнение программы пока не достигнута терминальная стадия



 */


import java.util.Random;
import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {

        String word = getRandomWord();
        boolean[] guessed = new boolean[word.length()];

        int attemptsLeft = 7;

        while (attemptsLeft > 0) {
            printWord(word, guessed);
            char letter = readLetter();

            boolean letterFound = false;
            for (int i = 0; i < word.length(); i++) {
                if (letter == word.charAt(i)) {
                    letterFound = true;
                    guessed[i] = true;
                }
            }
            if (!letterFound) {
                attemptsLeft--;
            }

            if (gameWon(guessed)) {
                System.out.println("Красавец! Победил! Это слово" + word);
                return;
            }

        }
        System.out.println("Вы проиграли, это было слово: " + word);


    }

    // методы


    // Метод выбора слова из "словаря"
    public static String getRandomWord() {
        Random random = new Random();
        String[] words = {"Apple", "Java", "Hello", "World", "Orange", "Code", "Programming", "class", "Main"};
        int randomIndex = random.nextInt(words.length);

        return words[randomIndex];
    }

    // Метод считываем букву
    public static char readLetter() {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);

        return letter;
    }

    public static void printWord(String word, boolean[] guessed) {

        for (int i = 0; i < word.length(); i++) {
            if (guessed[i]) {
                System.out.print(word.charAt(i) + " ");
            } else {
                System.out.print("_ ");
            }
        }


    }

    public static boolean gameWon(boolean[] guessed) {
        for (int i = 0; i < guessed.length; i++) {
            if (!guessed[i]) {
                return false;
            }
        }
        return true;
    }
}
