package NGlesson28.homework;

public class Investment {
    private double amount;
    private double interestRate;
    private int years;

    public Investment(double amount, double interestRate, int years) {
        this.amount = amount;
        this.interestRate = interestRate;
        this.years = years;
    }

    public double getAmount() {
        return amount;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public int getYears() {
        return years;
    }

    public double calculateProfit() {
        return amount * Math.pow(1 + interestRate / 100, years) - amount;
    }

    @Override
    public String toString() {
        return "Investment{" +
                "amount=" + amount +
                ", interestRate=" + interestRate +
                ", years=" + years +
                '}';
    }
}

