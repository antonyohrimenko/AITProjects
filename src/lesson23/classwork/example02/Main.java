package lesson23.classwork.example02;

public class Main {
    public static void main(String[] args) {


        Human anton = new Human("Anton", "Hamburg", 35);
        CreditBankAccount account = new CreditBankAccount(1, "DE12345", anton, 1000);

        account.deposit(1500);
        System.out.println("Account " + account.getAmount());
        account.takeLoan(500);
        System.out.println("Account " + account.getAmount());
        System.out.println("Current Debt " + account.getCurrentDebt());

        System.out.println("\n ============= \n");

        account.takeLoan(1000);
        System.out.println("Account " + account.getAmount());
        System.out.println("Current Debt " + account.getCurrentDebt());



    }
}



