package lesson21.classwork.example01;

import java.util.Random;

public class IBANGenerator {

    // Создаем Random с уникальным сидом, чтобы IBAN
    // сгенерированный не менялся у обьекта
    private static final Random random = new Random(12345);


    // Генерация IBAN номера
    public static String generateIBAN() {
        // Задаем префикс для Германии
        String countryCode = "DE";

        // Задаем банковский код (8 цифр)
        String bankCode = generateRandomNumber(8);

        // Задаем номер счета (10 цифр)
        String accountNumber = generateRandomNumber(10);

        // Вычисляем контрольное число (2 цифры)
        String checkDigit = calculateCheckDigit(countryCode, bankCode, accountNumber);

        // Собираем IBAN номер
        return countryCode + checkDigit + bankCode + accountNumber;
    }

    // Генерирует случайное число заданной длины
    private static String generateRandomNumber(int length) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append(random.nextInt(10)); // Генерация случайной цифры от 0 до 9
        }
        return sb.toString();
    }

    // Расчет контрольной суммы (ну это слишком было б задротством)
    private static String calculateCheckDigit(String countryCode, String bankCode, String accountNumber) {
        // Обычно контрольное число - это 2 цифры мудрено вычисляемые, но зачем заморачиваться с вычислением.
        // Использую просто случайную строку длиной 2 символа
        // оно мне надо? я на шашлыки хочу :)
        return generateRandomNumber(2); // пусть будет так :)
    }
}
