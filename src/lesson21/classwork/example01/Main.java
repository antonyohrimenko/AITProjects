package lesson21.classwork.example01;

// разработать класс для банковского аккаунта

public class Main {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount("Anton Okhrimenko", AccountType.CREDIT);

        bankAccount.deposit(500);
        System.out.println("Deposited 500, amount: " + bankAccount.getAmount());
        bankAccount.withdraw(400);
        System.out.println("Withdrawn 400, amount: " + bankAccount.getAmount());
        System.out.println(bankAccount.hasDebt());
        bankAccount.withdraw(200);

        System.out.println("In debt - 100, amount: " + bankAccount.getAmount());
        System.out.println(bankAccount.hasDebt());
        System.out.println();
        System.out.println();
        System.out.println();



        System.out.println("================== HOMEWORK 21 LESSON ===============================");
        System.out.println("==================  RANDOM IBAN  ================================");
        System.out.println("Name: " + bankAccount.getFullName() + " " + bankAccount.getIban() + " " + bankAccount.getAmount());
        BankAccount nextBankAccount = new BankAccount("Vasya Pupkin", AccountType.CREDIT);
        System.out.println("Name: " + nextBankAccount.getFullName() + " " + nextBankAccount.getIban() + " " + nextBankAccount.getAmount());

        System.out.println();
        System.out.println("========================  BANK CONTROLLER  ==========================");

        BankController bankController = new BankController(10); // пусть будет 10 аккаунтов
        bankController.registerAccount("User1", AccountType.CREDIT);
        bankController.registerAccount("User2", AccountType.DEBIT);

        bankController.displayAllAccounts();
        bankController.depositToAccount("DE47629880210844480985", 1000 ); // пополнили user1
        bankController.printAccountInfoByIban("DE47629880210844480985");  // работает :)

        // делаем трансфер денег на user2
        // (отправитель - получатель)

        System.out.println();
        System.out.println("=====================================================================");
        bankController.transferMoney("DE47629880210844480985", "DE25473839030961868692", 500);
        bankController.displayAllAccounts();

        // кредитный аккаунт может отправлять деньги уходя в минус
        // дебетовый делать так не должен. Попробуем с Дебетовым отправить больше чем 500

        bankController.transferMoney("DE25473839030961868692","DE47629880210844480985", 600);

        // ну все работает, можно и на шашлыки :)











    }
}
