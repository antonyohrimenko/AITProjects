package NGlesson28.homework;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        String filePath = "investments.txt";
        List<Investment> investments = InvestmentReader.readInvestmentsFromFile(filePath);
        InvestmentCalculator.calculateAndDisplayResults(investments);

    }
}
