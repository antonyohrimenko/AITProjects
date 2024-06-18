package NGlesson28.homework;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        String filePath = "investment.txt";
        List<Investment> investments = InvestmentReader.readInvestmentsFromFile(filePath);
        InvestmentCalculator.calculateAndDisplayResults(investments);

    }
}
