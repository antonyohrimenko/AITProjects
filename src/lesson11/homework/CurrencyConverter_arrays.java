package lesson11.homework;

import java.util.Scanner;

public class CurrencyConverter_arrays {
    public static void main(String[] args) {

        // Создаем массив курсов валют относительно базовой валюты (EURO)
        double[] exchangeRates = {1.0, 1.07, 34.61, 100}; // EURO, USD, TL

        // Создаем массив названий валют
        String[] currencies = {"EURO", "USD", "TL", "RUB"};

        Scanner scan = new Scanner(System.in);

        // Выводим приветственное "окно"
        System.out.println("\nПриветствуем в CurrencyConverter!");

        int sourceCurrencyIndex;
        do {
            // Вывод списка исходных валют в консоль
            System.out.println("Выберите исходную валюту:");
            for (int i = 0; i < currencies.length; i++) {
                System.out.println((i + 1) + ". " + currencies[i]);
            }
            System.out.println("0. Выход");

            // Чтение выбора пользователя
            sourceCurrencyIndex = scan.nextInt();

            if (sourceCurrencyIndex == 0) {
                // Выход из программы
                System.out.println("До свидания!");
                return;
            } else if (sourceCurrencyIndex < 0 || sourceCurrencyIndex > currencies.length) {
                // Проверка на рукожопость
                System.out.println("Некорректный выбор. Попробуйте снова.");
                continue;
            }

            // Запрашиваем сумму в исходной валюте
            System.out.println("Введите сумму в " + currencies[sourceCurrencyIndex - 1] + ":");
            double sourceAmount = scan.nextDouble();

            // Вывод списка доступных целевых валют
            System.out.println("Выберите целевую валюту:");
            for (int i = 0; i < currencies.length; i++) {
                if (i + 1 != sourceCurrencyIndex) {
                    // Пропускаем выбранную пользователем исходную валюту при выводе списка целевых валют
                    // иначе зачем менять евро на евро :)
                    System.out.println((i + 1) + ". " + currencies[i]);
                }
            }

            // Считываем целевую валюту
            int targetCurrencyIndex = scan.nextInt();

            // Проверка на некорректный ввод
            if (targetCurrencyIndex < 1 || targetCurrencyIndex > currencies.length) {
                System.out.println("Некорректный выбор целевой валюты. Попробуйте снова.");
                continue;
            }

            // Вызов метода для конвертации и вывод результата. Для удобства выведем 2 знака после запятой
            double convertedAmount = convertCurrency(sourceAmount, exchangeRates[sourceCurrencyIndex - 1], exchangeRates[targetCurrencyIndex - 1]);
            System.out.println("Результат конвертации: " + String.format("%.2f", convertedAmount) + " " + currencies[targetCurrencyIndex - 1]);

        } while (sourceCurrencyIndex != 0);
    }

    // Метод для конвертации суммы из одной валюты в другую
    public static double convertCurrency(double sourceAmount, double sourceExchangeRate, double targetExchangeRate) {
        return (sourceAmount / sourceExchangeRate) * targetExchangeRate;
    }
}

