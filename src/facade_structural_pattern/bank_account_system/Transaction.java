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
class Transaction {
    public void recordTransaction(String accountNumber, String type, double amount) {
        System.out.println("Transaction recorded for account " + accountNumber + ": " + type + " of $" + amount);
    }
}
