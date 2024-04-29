package lesson21.classwork.example01;

import javax.sound.midi.Soundbank;

public class BankController {
    private BankAccount[] accounts; // делаем массив как в примере с библиотекой
    private int numAccounts; // для подсчета аккаунтов

    public BankController(int maxAccounts) {
        this.accounts = new BankAccount[maxAccounts];
        this.numAccounts = 0;
    }

    // регистрируем новый аккаунт
    public void registerAccount(String fullName, AccountType accountType) {
        if (numAccounts < accounts.length) {
            BankAccount account = new BankAccount(fullName, accountType);
            accounts[numAccounts] = account;
            numAccounts++;
        } else {
            System.out.println("Cannot register more accounts. Maximum capacity reached.");
        }
    }

    public void transferMoney(String senderIban, String receiverIban, double amount) {
        BankAccount senderAccount = findAccountByIBAN(senderIban);
        BankAccount receiverAccount = findAccountByIBAN(receiverIban);

        if (senderAccount == null || receiverAccount == null) {
            System.out.println("One or both accounts not found.");
            return;
        }

        if (senderAccount.getAccountType() == AccountType.DEBIT && amount > senderAccount.getAmount()) {
            System.out.println("Not enough funds on the sender account.");
            return;
        }

        senderAccount.withdraw(amount);
        receiverAccount.deposit(amount);
        System.out.println("Money transferred successfully.");
    }



//    public void transferMoney(String senderIBAN, String receiverIBAN, double amount) {
//        BankAccount sender = findAccountByIBAN(senderIBAN);
//        BankAccount receiver = findAccountByIBAN(receiverIBAN);
//        if (sender != null && receiver != null) {
//            sender.withdraw(amount);
//            receiver.deposit(amount);
//            System.out.println("Transfering " + amount + "... SUCCESSFUL!");
//        } else {
//            System.out.println("One or both of the accounts do not exist.");
//        }
//    }

    public void displayAllAccounts() {
        for (int i = 0; i < numAccounts; i++) {
            BankAccount account = accounts[i];
            System.out.println("Full Name: " + account.getFullName());
            System.out.println("IBAN: " + account.getIban());
            System.out.println("Account Type: " + account.getAccountType());
            System.out.println("Amount: " + account.getAmount());
            System.out.println();
        }
    }
    private BankAccount findAccountByIBAN(String iban) {
        for (int i = 0; i < numAccounts; i++) {
            BankAccount account = accounts[i];
            if (account.getIban().equals(iban)) {
                return account;
            }
        }
        return null;
    }

    // для вывода информации по конкретному аккаунту
    public void printAccountInfoByIban(String iban) {
        for (int i = 0; i < numAccounts; i++) {
            if (accounts[i].getIban().equals(iban)) {
                BankAccount account = accounts[i];
                System.out.println("Account Information:");
                System.out.println("Full Name: " + account.getFullName());
                System.out.println("IBAN: " + account.getIban());
                System.out.println("Account Type: " + account.getAccountType());
                System.out.println("Amount: " + account.getAmount());
                return;
            }
        }
        System.out.println("Account with IBAN " + iban + " not found.");
    }


    // так как пополнения тут у нас нет - напишем его
    public void depositToAccount(String iban, double amount) {
        for (int i = 0; i < numAccounts; i++) {
            if (accounts[i].getIban().equals(iban)) {
                accounts[i].deposit(amount);
                System.out.println("Deposit of " + amount + " to account " + iban + " successful.");
                return;
            }
        }
        System.out.println("Account with IBAN " + iban + " not found.");
    }
}
