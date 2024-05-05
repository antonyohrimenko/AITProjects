package lesson23.classwork.example02;


public class BankAccount {

    protected int id;
    protected String iban;
    protected Human owner; // агрегация

    protected double amount;

    public BankAccount(int id, String iban, Human owner) {
        this.id = id;
        this.iban = iban;
        this.owner = owner;
        this.amount = 0;
    }

    public Human getOwner() {
        return owner;
    }

    public void setOwner(Human owner) {
        this.owner = owner;
    }

    public int getId() {
        return id;
    }

    public String getIban() {
        return iban;
    }

    public double getAmount() {
        return amount;
    }

 public void withdraw(double amount){
        if (this.amount >= amount){
            this.amount-=amount;
        }
 }

 public void deposit(double amount){
        this.amount += amount;
 }

}
