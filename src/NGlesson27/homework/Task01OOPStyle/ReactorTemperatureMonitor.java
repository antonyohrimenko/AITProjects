package NGlesson27.homework.Task01OOPStyle;

import java.util.Scanner;

public class ReactorTemperatureMonitor {
    private final TemperatureAnalyzer analyzer;
    private final Scanner scanner;

    public ReactorTemperatureMonitor() {
        this.analyzer = new TemperatureAnalyzer();
        this.scanner = new Scanner(System.in);
    }

    public void startMonitoring() {
        while (true) {
            System.out.print("Введите температуру реактора: ");
            double currentTemperature = scanner.nextDouble();
            analyzer.addTemperature(currentTemperature);
            analyzer.printCurrentAnalysis();
        }
    }
}
