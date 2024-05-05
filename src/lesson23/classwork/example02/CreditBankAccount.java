package lesson23.classwork.example02;


public class CreditBankAccount extends BankAccount {
    private double creditLimit;
    private double currentDebt;

    public CreditBankAccount(int id, String iban, Human owner, double creditLimit) {
        super(id, iban, owner);
        this.creditLimit = creditLimit;
        this.currentDebt = 0;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public double getCurrentDebt() {
        return currentDebt;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public void takeLoan(double amount) {
        if (amount > creditLimit - currentDebt) {
            System.out.println("Превышен кредитный лимит");
            return;
        }
        currentDebt += amount;
        this.amount += amount;
    }

    public void repay(double amount) {
        double diff = amount - currentDebt;
        if (diff > 0){
            currentDebt = 0;
            this.amount += diff;
        }
        else {
            currentDebt -= amount;
        }

    }
}
