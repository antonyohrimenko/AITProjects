package lesson27.homework.LetterFollowChecker;

public class LetterFollowChecker {

    /*
    Task: Given a string, return if all occurrences of a given letter are always
    immediately followed by the other given letter.
     */


    // Метод для проверки, если все вхождения буквы letter1 всегда следуют за letter2
    public static boolean allOccurrencesFollowedBy(String input, char letter1, char letter2) {
        // Перебираем каждый символ строки, кроме последнего (чтобы избежать вылет за границы)
        for (int i = 0; i < input.length() - 1; i++) {
            // Если текущий символ равен letter1
            if (input.charAt(i) == letter1) {
                // Проверяем, что следующий символ равен letter2
                if (input.charAt(i + 1) != letter2) {
                    return false; // Если следующий символ не равен letter2, возвращаем false
                }
            }
        }
        return true; // Если все вхождения letter1 следуют за letter2, возвращаем true
    }

    public static void main(String[] args) {
        // Тестим
        System.out.println(allOccurrencesFollowedBy("he headed to the store", 'h', 'e')); // Вывод: true
        System.out.println(allOccurrencesFollowedBy("abcdee", 'e', 'd')); // Вывод: false
    }
}
