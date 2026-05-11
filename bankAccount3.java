// Parent class
class BankAccount {

    double balance = 1000;

    // Method to deposit money
    void deposit(double amount) {
        balance += amount;
        System.out.println("Amount Deposited: " + amount);
        System.out.println("Balance: " + balance);
    }
}

// SavingsAccount class
class SavingsAccount extends BankAccount {

    double interestRate = 5; // 5% interest

    // Overriding deposit() method
    @Override
    void deposit(double amount) {

        balance += amount;

        // Adding interest
        double interest = (balance * interestRate) / 100;
        balance += interest;

        System.out.println("Savings Account Deposit: " + amount);
        System.out.println("Interest Added: " + interest);
        System.out.println("Balance: " + balance);
    }
}

// CheckingAccount class
class CheckingAccount extends BankAccount {

    // Overriding deposit() method
    @Override
    void deposit(double amount) {

        balance += amount;

        System.out.println("Money deposited in Checking Account");
        System.out.println("Balance: " + balance);
    }
}

// Main class
public class bankAccount3{

    public static void main(String[] args) {

        // Object of SavingsAccount
        SavingsAccount s = new SavingsAccount();

        // Object of CheckingAccount
        CheckingAccount c = new CheckingAccount();

        // Calling deposit methods
        s.deposit(500);

        System.out.println();

        c.deposit(700);
    }
}
/*
o/p
Savings Account Deposit: 500.0
Interest Added: 75.0
Balance: 1575.0

Money deposited in Checking Account
Balance: 1700.0  */