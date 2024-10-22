/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade_structural_pattern.bank_account_system;

/**
 *
 * @author fa21-bse-011
 */
import java.util.HashMap;
import java.util.Map;

class BankFacade {
    private Map<String, Account> accounts;
    private Transaction transaction;
    private Notification notification;

    public BankFacade() {
        accounts = new HashMap<>();
        transaction = new Transaction();
        notification = new Notification();
    }

    public void createAccount(String accountNumber) {
        accounts.put(accountNumber, new Account(accountNumber));
        System.out.println("Account created: " + accountNumber);
    }

    public void deposit(String accountNumber, double amount) {
        Account account = accounts.get(accountNumber);
        if (account != null) {
            account.deposit(amount);
            transaction.recordTransaction(accountNumber, "Deposit", amount);
            notification.sendNotification("Deposited: $" + amount + " to account " + accountNumber);
        } else {
            System.out.println("Account does not exist: " + accountNumber);
        }
    }

    public void withdraw(String accountNumber, double amount) {
        Account account = accounts.get(accountNumber);
        if (account != null) {
            account.withdraw(amount);
            transaction.recordTransaction(accountNumber, "Withdrawal", amount);
            notification.sendNotification("Withdrew: $" + amount + " from account " + accountNumber);
        } else {
            System.out.println("Account does not exist: " + accountNumber);
        }
    }

    public void checkBalance(String accountNumber) {
        Account account = accounts.get(accountNumber);
        if (account != null) {
            System.out.println("Current balance for account " + accountNumber + ": $" + account.getBalance());
        } else {
            System.out.println("Account does not exist: " + accountNumber);
        }
    }
}

