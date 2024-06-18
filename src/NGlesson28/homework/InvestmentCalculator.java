package NGlesson28.homework;

import java.util.List;

public class InvestmentCalculator {
    public static void calculateAndDisplayResults(List<Investment> investments) {

        if (investments.isEmpty()) {
            System.out.println("No investments found.");
            return;
        }

        double totalProfit = 0;
        Investment bestInvestment = null;
        double maxProfit = Double.NEGATIVE_INFINITY;

        for (Investment investment : investments) {
            double profit = investment.calculateProfit();
            totalProfit += profit;

            if (profit > maxProfit) {
                maxProfit = profit;
                bestInvestment = investment;
            }
        }

        double averageProfit = totalProfit / investments.size();

        System.out.println("Доход от каждого вклада:");
        for (Investment investment : investments) {
            System.out.println(investment + ", Доход без учета тела: " + investment.calculateProfit() + " Средний доход по вкладу: "+ investment.calculateProfit()/investment.getYears());
        }

        System.out.println("Наиболее прибыльная инвестиция: " + bestInvestment + ", Доход: " + maxProfit);
        System.out.println("Средний доход вклада: " + averageProfit);
    }
}
