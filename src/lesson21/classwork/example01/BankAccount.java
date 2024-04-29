package lesson21.classwork.example01;

public class BankAccount {

    private String fullName;
    private final String iban;
    private final AccountType accountType;
    private double amount;

    // убираем из конструктора iban. Он генерируется автоматически для клиента
    public BankAccount(String fullName, AccountType accountType) {
        this.fullName = fullName;
        this.iban = IBANGenerator.generateIBAN();
        this.accountType = accountType;
        this.amount = 0;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getIban() {
        return iban;
    }

    public AccountType getAccountType() {
        return accountType;
    }


    public void deposit(double amount) {
        this.amount += amount;
    }

    public double getAmount(){
        return this.amount;
    }

    public void withdraw (double amount){
        if(amount <= this.amount || accountType == AccountType.CREDIT)
        {
            this.amount -= amount;
        }
    }

    public boolean hasDebt (){
        return this.amount < 0;
    }
}
