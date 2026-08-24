package Practicum;

import java.util.Scanner;

class BankAccount {
    String name;
    long accountNumber;
    double balance;

    BankAccount(String name, long accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount deposited successfully.");
        } else {
            System.out.println("Invalid amount.");
        }
    }

    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Amount withdrawn successfully.");
        }
    }

    void checkBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }

    void displayAccount() {
        System.out.println("\n--- Account Details ---");
        System.out.println("Account Holder: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: ₹" + balance);
    }
}

public class BankManagementSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankAccount account = null;
        int choice;

        do {
            System.out.println("\n===== BANK MANAGEMENT SYSTEM =====");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Check Balance");
            System.out.println("5. Display Account Details");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    sc.nextLine();
                    System.out.print("Enter account holder name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter account number: ");
                    long accountNumber = sc.nextLong();

                    System.out.print("Enter initial deposit: ");
                    double balance = sc.nextDouble();

                    account = new BankAccount(name, accountNumber, balance);

                    System.out.println("Account created successfully!");
                    break;

                case 2:
                    if (account != null) {
                        System.out.print("Enter amount to deposit: ");
                        double deposit = sc.nextDouble();
                        account.deposit(deposit);
                    } else {
                        System.out.println("Please create an account first.");
                    }
                    break;

                case 3:
                    if (account != null) {
                        System.out.print("Enter amount to withdraw: ");
                        double withdraw = sc.nextDouble();
                        account.withdraw(withdraw);
                    } else {
                        System.out.println("Please create an account first.");
                    }
                    break;

                case 4:
                    if (account != null) {
                        account.checkBalance();
                    } else {
                        System.out.println("Please create an account first.");
                    }
                    break;

                case 5:
                    if (account != null) {
                        account.displayAccount();
                    } else {
                        System.out.println("Please create an account first.");
                    }
                    break;

                case 6:
                    System.out.println("Thank you for using the Bank Management System!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 6);

        sc.close();
    }
}