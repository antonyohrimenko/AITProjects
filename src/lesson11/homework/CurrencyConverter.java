package lesson11.homework;


import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Выберите исходную валюту:");
            System.out.println("1. EURO");
            System.out.println("2. USD");
            System.out.println("3. TL");
            System.out.println("0. Выход");

            int sourceCurrency = scan.nextInt();

            switch (sourceCurrency) {
                case 0:
                    exit = true;
                    break;
                case 1:
                    convertCurrency("EURO");
                    break;
                case 2:
                    convertCurrency("USD");
                    break;
                case 3:
                    convertCurrency("TL");
                    break;
                default:
                    System.out.println("Неправильный выбор.");
            }
        }
        System.out.println("До свидания!");
    }

    public static void convertCurrency(String sourceCurrency) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите сумму в " + sourceCurrency + ": ");
        double sourceAmount = scanner.nextDouble();

        System.out.println("Выберите валюту, в которую нужно перевести:");
        System.out.println("1. EURO");
        System.out.println("2. USD");
        System.out.println("3. TL");

        int targetCurrency = scanner.nextInt();
        double targetAmount;

        switch (targetCurrency) {
            case 1:
                targetAmount = convertToEuro(sourceAmount, sourceCurrency);
                System.out.println("Результат перевода " + sourceAmount + " " + sourceCurrency + " в EURO: " + targetAmount);
                break;
            case 2:
                targetAmount = convertToUSD(sourceAmount, sourceCurrency);
                System.out.println("Результат перевода " + sourceAmount + " " + sourceCurrency + " в USD: " + targetAmount);
                break;
            case 3:
                targetAmount = convertToTL(sourceAmount, sourceCurrency);
                System.out.println("Результат перевода " + sourceAmount + " " + sourceCurrency + " в TL: " + targetAmount);
                break;
            default:
                System.out.println("Неправильный выбор.");
        }
    }

    public static double convertToEuro(double sourceAmount, String sourceCurrency) {
        // Определяем курс в зависимости от валюты

        double rate = 0.0;
        switch (sourceCurrency) {
            case "EURO":
                rate = 1.0; // Курс для EURO равен 1.0
                break;
            case "USD":
                rate = 0.93; // Курс для USD равен 0.032
                break;
            case "TL":
                rate = 0.029; // Курс для TL равен 0.029
                break;
            default:
                System.out.println("Неправильная исходная валюта.");
                return 0.0; // Возвращаем 0, если валюта неправильная
        }

        // Конвертируем сумму в EURO
        double targetAmount = sourceAmount * rate;
        return targetAmount;
    }

    public static double convertToUSD(double sourceAmount, String sourceCurrency) {
        double rate = 0.0;
        switch (sourceCurrency) {
            case "EURO":
                rate = 1.07; // Курс для EURO равен 1.07
                break;
            case "USD":
                rate = 1.0; // Курс для USD равен 1
                break;
            case "TL":
                rate = 0.031; // Курс для TL равен 0.031
                break;
            default:
                System.out.println("Неправильная исходная валюта.");
                return 0.0; // Возвращаем 0, если валюта неправильная
        }

        double targetAmount = sourceAmount * rate;
        return targetAmount;
    }

    public static double convertToTL(double sourceAmount, String sourceCurrency) {
        double rate = 0.0;
        switch (sourceCurrency) {
            case "EURO":
                rate = 34.60; // Курс для EURO равен 34,60
                break;
            case "USD":
                rate = 31.89; // Курс для USD равен 31,89
                break;
            case "TL":
                rate = 1.0; // Курс для TL равен 1.0
                break;
            default:
                System.out.println("Неправильная исходная валюта.");
                return 0.0; // Возвращаем 0, если валюта неправильная
        }

        double targetAmount = sourceAmount * rate;
        return targetAmount;
    }

}



