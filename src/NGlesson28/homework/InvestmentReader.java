package NGlesson28.homework;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class InvestmentReader {
    public static List<Investment> readInvestmentsFromFile(String filePath) {

        List<Investment> investments = new ArrayList<>();
        try {
            List<String> lines = Files.readAllLines(Paths.get(filePath));
            for (String line : lines) {
                String[] parts = line.split(" ");
                double amount = Double.parseDouble(parts[0]);
                double interestRate = Double.parseDouble(parts[1]);
                int years = Integer.parseInt(parts[2]);
                investments.add(new Investment(amount, interestRate, years));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return investments;
    }
}

