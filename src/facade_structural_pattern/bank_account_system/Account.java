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

class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount + ". New balance: $" + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount + ". New balance: $" + balance);
        } else {
            System.out.println("Insufficient funds for withdrawal of $" + amount);
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}

