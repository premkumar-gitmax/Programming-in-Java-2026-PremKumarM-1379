package Practicum;

class BankAccount {
    String accountHolderName;
    long accountNumber;
    String accountType;
    double accountBalance;

    BankAccount(String accountHolderName, long accountNumber, String accountType, double accountBalance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.accountBalance = accountBalance;
    }
    void deposit(double amount) {
        if (amount > 0) {
            accountBalance = accountBalance + amount;
            System.out.println("Amount deposited: " + amount);
            System.out.println("Updated balance: " + accountBalance);
        }
        else {
            System.out.println("Invalid deposit amount");
        }
    }
    void withdraw(double amount) {
        if (amount <= 0){
            System.out.println("Invalid withdrawal amount");
        }
        else if (amount > accountBalance) {
            System.out.println("Insufficient Balance");
        }
        else {
            accountBalance = accountBalance - amount;
            System.out.println("Amount withdrawn: " + amount);
            System.out.println("Updated balance: " + accountBalance);
        }
    }
    void balanceEnquiry() {
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Account Balance: " + accountBalance);
    }
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Ravi", 1001, "Savings", 10000);
    
        account.balanceEnquiry(); System.out.println();

        account.deposit(5000); System.out.println();

        account.withdraw(3000); System.out.println();

        account.withdraw(12000);System.out.println();

        account.withdraw(15000); System.out.println();

        account.balanceEnquiry(); System.out.println();

        account.deposit(0); System.out.println();

        account.withdraw(-500); System.out.println();

        account.withdraw(0); System.out.println();
        
        // account.withdraw(); cannot be called without an argument, as the method requires a double parameter
        // withdraw(0); and deposit(0); cannot be called without an object reference, as they are instance methods and not static methods     
    }
}