package NGlesson27.homework.Task01OOPStyle;

import java.util.ArrayList;
import java.util.List;

public class TemperatureAnalyzer {
    private static final double AVERAGE_THRESHOLD_PERCENT = 0.10;
    private static final double PREVIOUS_DIFFERENCE_PERCENT = 20.0;

    private final List<Double> temperatures;
    private Double previousTemperature;

    public TemperatureAnalyzer() {
        this.temperatures = new ArrayList<>();
        this.previousTemperature = null;
    }

    public void addTemperature(double temperature) {
        temperatures.add(temperature);
    }

    public void printCurrentAnalysis() {
        double currentTemperature = temperatures.get(temperatures.size() - 1);
        double averageAllTime = calculateAverage(temperatures);

        System.out.printf("Средняя температура за все время: %.2f\n", averageAllTime);
        System.out.println(calculateDifference(previousTemperature, currentTemperature));

        checkForAlert(currentTemperature, averageAllTime);
        previousTemperature = currentTemperature;
    }

    private double calculateAverage(List<Double> temperatures) {
        double sum = 0;
        for (double temp : temperatures) {
            sum += temp;
        }
        return sum / temperatures.size();
    }

    private String calculateDifference(Double previousTemperature, double currentTemperature) {
        if (previousTemperature == null) {
            return "Предыдущего значения нет.";
        }
        double difference = currentTemperature - previousTemperature;
        return String.format("Текущая температура отличается от предыдущей на %.2f градусов.", difference);
    }

    private void checkForAlert(double currentTemperature, double averageAllTime) {
        if (previousTemperature != null) {
            double averageLast10 = calculateAverageLastN(temperatures, 10);
            double previousToCurrentDifferencePercentage = ((currentTemperature - previousTemperature) / previousTemperature) * 100;

            if (currentTemperature > averageAllTime * (1 + AVERAGE_THRESHOLD_PERCENT) &&
                    previousToCurrentDifferencePercentage > PREVIOUS_DIFFERENCE_PERCENT) {
                System.out.println("Тревога, превышение температуры!");
            }

            System.out.printf("Средняя температура за последние 10 измерений: %.2f\n", averageLast10);

            if (temperatures.size() % 100 == 0) {
                double averageEvery100th = calculateAverageEveryNth(temperatures, 100);
                System.out.printf("Средняя температура каждого 100-го измерения: %.2f\n", averageEvery100th);
            }
        }
    }

    private double calculateAverageLastN(List<Double> temperatures, int n) {
        int size = temperatures.size();
        if (size < n) {
            return calculateAverage(temperatures);
        }
        List<Double> lastNTemperatures = temperatures.subList(size - n, size);
        return calculateAverage(lastNTemperatures);
    }

    private double calculateAverageEveryNth(List<Double> temperatures, int n) {
        double sum = 0;
        int count = 0;
        for (int i = n - 1; i < temperatures.size(); i += n) {
            sum += temperatures.get(i);
            count++;
        }
        return sum / count;
    }
}
