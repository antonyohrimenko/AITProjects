package lesson20.homework;

public enum Currency {
        EURO(1.0),
        USD(1.07),
        TL(34.75);

    private final double conversionRate;

    Currency(double conversionRate) {
        this.conversionRate = conversionRate;
    }

    public double getConversionRate() {
        return conversionRate;
    }

    // метод конвертации валюты на уровне пакета
    static double convertCurrency(double amount, Currency sourceCurrency, Currency targetCurrency) {
        double conversionRate = targetCurrency.getConversionRate() / sourceCurrency.getConversionRate();
        return amount * conversionRate;
    }
}
