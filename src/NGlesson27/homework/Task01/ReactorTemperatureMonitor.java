package NGlesson27.homework.Task01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReactorTemperatureMonitor {

    //1) Пользователь бесконечно вводит числа в программу - температуру ядерного реактора.
    //2) После КАЖДОГО введеного числа сообщите пользователю информацию:

    //2.1) Среднее значение температуры ядерного за ВСЕ время
    //2.2) Насколько текущая введеная температура отличается от предыдущей
    //2.3) Если введеная температура превышает среднюю на 10% и повысилась относительно предыдущего значения более, чем на 20%,
    //    То напишите на экран собщение "Тревога, превышение температуры"

    //Усложненное задание:
    //3.1) Рассчитайте также среднюю температуру за 10 последних измерений и среднюю температуру каждого 100ого измерения


    public static void main(String[] args) {

        List<Double> temperatures = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Double previousTemperature = null;

        while (true) {

            System.out.println("===============");
            System.out.println("Введитите температуру ядерного реактора: ");
            double currentTemperature = scanner.nextDouble();
            temperatures.add(currentTemperature);

            // Рассчитываем среднюю температуру за все время
            double averageAllTime = calculateAverage(temperatures);

            // Разница с предыдущей температурой
            String differenceMessage = calculateDifference(previousTemperature, currentTemperature);

            // Проверка на превышение температуры
            checkForAlert(temperatures, averageAllTime, previousTemperature, currentTemperature);

            // вывод общей инфы
            System.out.println("Средняя температура ядерного реактора за ВСЕ время: " + averageAllTime);
            System.out.println(differenceMessage);

            // обновляем значение
            previousTemperature = currentTemperature;
        }
    }

    public static double calculateAverage(List<Double> temperatures) {

        double sum = 0.0;
        for (int i = 0; i < temperatures.size(); i++) {
            sum += temperatures.get(i);
        }
        return sum / temperatures.size();
    }

    private static String calculateDifference(Double previousTemperature, double currentTemperature) {

        if (previousTemperature == null) {
            return "Предыдущего значения нет";
        }
        double difference = currentTemperature - previousTemperature;
        return String.format("Текущая температура отличается от предыдущей на %.2f градусов.", difference);
    }



    // доп.задание
    private static void checkForAlert(List<Double> temperatures, double averageAllTime, Double previousTemperature, double currentTemperature) {
        if (previousTemperature != null) {
            double averageLast10 = calculateAverageLastN(temperatures, 10);
            double previousToCurrentDifferencePercentage = ((currentTemperature - previousTemperature) / previousTemperature) * 100;

            if (currentTemperature > averageAllTime * 1.1 && previousToCurrentDifferencePercentage > 20) {
                System.out.println("Тревога, превышение температуры!");
            }

            System.out.printf("Средняя температура за последние 10 измерений: %.2f\n", averageLast10);

            if (temperatures.size() % 100 == 0) {
                double averageEvery100th = calculateAverageEveryNth(temperatures, 100);
                System.out.printf("Средняя температура каждого 100-го измерения: %.2f\n", averageEvery100th);
            }
        }
    }

    private static double calculateAverageLastN(List<Double> temperatures, int n) {
        int size = temperatures.size();
        if (size < n) {
            return calculateAverage(temperatures);
        }
        List<Double> lastNTemperatures = temperatures.subList(size - n, size);
        return calculateAverage(lastNTemperatures);
    }

    private static double calculateAverageEveryNth(List<Double> temperatures, int n) {
        double sum = 0;
        int count = 0;
        for (int i = n - 1; i < temperatures.size(); i += n) {
            sum += temperatures.get(i);
            count++;
        }
        return sum / count;
    }
}

