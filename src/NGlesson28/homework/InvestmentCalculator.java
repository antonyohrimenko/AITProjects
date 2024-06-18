package NGlesson28.homework;

import java.util.List;

public class InvestmentCalculator {
    private static final double AVERAGE_PROFIT_THRESHOLD = 1.1;
    private static final double PREVIOUS_PROFIT_THRESHOLD = 1.2;

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

        System.out.println("Profits from each investment:");
        for (Investment investment : investments) {
            System.out.println(investment + ", Profit: " + investment.calculateProfit());
        }

        System.out.println("Most profitable investment: " + bestInvestment + ", Profit: " + maxProfit);
        System.out.println("Average profit: " + averageProfit);
    }
}
