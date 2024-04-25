package lesson20.homework;
import java.util.Scanner;


public class CurrencyConverter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to CurrencyConverter!");

        // Выбираем исходную валюту
        System.out.println("Select the source currency:");
        Currency[] currencies = Currency.values();

        for (int i = 0; i < currencies.length; i++) {
            System.out.println((i + 1) + ". " + currencies[i]);
        }
        int sourceCurrencyIndex = scanner.nextInt();

        // Задаем сумму в исходной валюте
        System.out.println("Enter the amount in " + currencies[sourceCurrencyIndex - 1] + ":");
        double amount = scanner.nextDouble();

        // Задаем целевую валюту
        System.out.println("Select the target currency:");
        for (int i = 0; i < currencies.length; i++) {
            if (i != sourceCurrencyIndex - 1) {
                System.out.println((i + 1) + ". " + currencies[i]);
            }
        }
        int targetCurrencyIndex = scanner.nextInt();

        // Выполняем конвертацию
        double convertedAmount = Currency.convertCurrency(amount, currencies[sourceCurrencyIndex - 1],
                currencies[targetCurrencyIndex - 1]);


        // Выводим результат до 2 знаков после запятой
        System.out.println("Converted amount: " + String.format("%.2f", convertedAmount) + " " +
                currencies[targetCurrencyIndex - 1]);
    }
}