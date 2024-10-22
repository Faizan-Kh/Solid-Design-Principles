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
import java.util.Scanner;

public class BankAccountManagementTest {
    public static void main(String[] args) {
        BankFacade bankFacade = new BankFacade();
        Scanner scanner = new Scanner(System.in);
        String choice;

        // Creating accounts
        System.out.println("Creating accounts...");
        bankFacade.createAccount("123456789");
        bankFacade.createAccount("987654321");

        do {
            System.out.println("\nChoose an option: ");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter account number: ");
                    String depositAccount = scanner.nextLine();
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = Double.parseDouble(scanner.nextLine());
                    bankFacade.deposit(depositAccount, depositAmount);
                    break;

                case "2":
                    System.out.print("Enter account number: ");
                    String withdrawAccount = scanner.nextLine();
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = Double.parseDouble(scanner.nextLine());
                    bankFacade.withdraw(withdrawAccount, withdrawAmount);
                    break;

                case "3":
                    System.out.print("Enter account number: ");
                    String balanceAccount = scanner.nextLine();
                    bankFacade.checkBalance(balanceAccount);
                    break;

                case "4":
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (!choice.equals("4"));

        scanner.close();
    }
}
