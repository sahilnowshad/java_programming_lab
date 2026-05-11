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

// Grandchild class
class FixedDepositAccount extends SavingsAccount {

    int term; // in years

    // Constructor
    FixedDepositAccount(String accountNumber,
                        double balance,
                        double interestRate,
                        double minimumBalance,
                        int term) {

        super(accountNumber, balance, interestRate, minimumBalance);
        this.term = term;
    }

    // Method to calculate interest
    double getInterest() {
        return (balance * interestRate * term) / 100;
    }
}

// Main class
public class bank_account_system{

    public static void main(String[] args) {

        // Object of BankAccount class
        BankAccount b1 =
                new BankAccount("ACC101", 5000, 5);

        System.out.println("Bank Account:");
        b1.deposit(2000);

        System.out.println();

        // Object of SavingsAccount class
        SavingsAccount s1 =
                new SavingsAccount("SAV201", 10000, 4, 2000);

        System.out.println("Savings Account:");
        s1.deposit(3000);
        s1.withdraw(4000);

        System.out.println();

        // Object of FixedDepositAccount class
        FixedDepositAccount f1 =
                new FixedDepositAccount("FD301",
                        20000,
                        6,
                        5000,
                        3);

        System.out.println("Fixed Deposit Account:");
        f1.deposit(5000);

        System.out.println("Interest Earned: " +
                           f1.getInterest());
    }
}
/* 
o/p
Bank Account:
Deposited Amount: 2000.0
Current Balance: 7000.0

Savings Account:
Deposited Amount: 3000.0
Current Balance: 13000.0
Withdrawn Amount: 4000.0
Remaining Balance: 9000.0

Fixed Deposit Account:
Deposited Amount: 5000.0
Current Balance: 25000.0
Interest Earned: 4500.0  */