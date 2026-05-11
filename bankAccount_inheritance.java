// Parent class
class BankAccount {

    String accountNumber;
    double balance;
    double interestRate;

    // Constructor
    BankAccount(String accountNumber, double balance, double interestRate) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    // Method to deposit amount
    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited Amount: " + amount);
        System.out.println("Current Balance: " + balance);
    }
}

// Child class
class SavingsAccount extends BankAccount {

    double minimumBalance;

    // Constructor
    SavingsAccount(String accountNumber, double balance,
                   double interestRate, double minimumBalance) {

        super(accountNumber, balance, interestRate);
        this.minimumBalance = minimumBalance;
    }

    // Method to withdraw amount
    void withdraw(double amount) {

        if ((balance - amount) >= minimumBalance) {
            balance = balance - amount;
            System.out.println("Withdrawn Amount: " + amount);
            System.out.println("Remaining Balance: " + balance);
        } else {
            System.out.println("Cannot withdraw amount.");
            System.out.println("Minimum balance must be maintained.");
        }
    }
}

// Main class
public class bankAccount_inheritance{
    public static void main(String[] args) {

        // Object of BankAccount class
        BankAccount b = new BankAccount("ACC101", 5000, 5);

        System.out.println("Bank Account:");
        b.deposit(2000);

        System.out.println();

        // Object of SavingsAccount class
        SavingsAccount s = new SavingsAccount("SAV201", 10000, 4, 2000);

        System.out.println("Savings Account:");
        s.deposit(3000);
        s.withdraw(5000);
    }
}
/* o/p
   Bank Account:
Deposited Amount: 2000.0
Current Balance: 7000.0

Savings Account:
Deposited Amount: 3000.0
Current Balance: 13000.0
Withdrawn Amount: 5000.0
Remaining Balance: 8000.0  */