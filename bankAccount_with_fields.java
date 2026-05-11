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

    // Method to deposit money
    void deposit(double amount) {
        balance += amount;

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

    // Method to withdraw money
    void withdraw(double amount) {

        if ((balance - amount) >= minimumBalance) {
            balance -= amount;

            System.out.println("Withdrawn Amount: " + amount);
            System.out.println("Remaining Balance: " + balance);
        } else {
            System.out.println("Withdrawal not possible.");
            System.out.println("Minimum balance should be maintained.");
        }
    }
}

// Main class
public class bankAccount_with_fields {

    public static void main(String[] args) {

        // Object of BankAccount class
        BankAccount b1 = new BankAccount("ACC1001", 5000, 4.5);

        System.out.println("Bank Account Details:");
        b1.deposit(2000);

        System.out.println();

        // Object of SavingsAccount class
        SavingsAccount s1 =
                new SavingsAccount("SAV2001", 10000, 5.0, 2000);

        System.out.println("Savings Account Details:");
        s1.deposit(3000);
        s1.withdraw(4000);
    }
}
/*o/p
  Bank Account Details:
Deposited Amount: 2000.0
Current Balance: 7000.0

Savings Account Details:
Deposited Amount: 3000.0
Current Balance: 13000.0
Withdrawn Amount: 4000.0
Remaining Balance: 9000.0 */