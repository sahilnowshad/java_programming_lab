import java.util.Scanner;

class BankAccount {
    int accountNumber;
    double balance;
    double transactionLimit;

    // Constructor
    BankAccount(int accNo, double bal, double limit) {
        accountNumber = accNo;
        balance = bal;
        transactionLimit = limit;
    }

    // Deposit method
    void deposit(double amount) {
        if (amount > transactionLimit) {
            System.out.println("Deposit exceeds transaction limit!");
        } else {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
    }

    // Withdrawal method
    void withdraw(double amount) {
        if (amount > transactionLimit) {
            System.out.println("Withdrawal exceeds transaction limit!");
        } else if (amount > balance) {
            System.out.println("Insufficient balance! Penalty applied.");
            balance -= 100; // penalty
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    // Calculate monthly interest (e.g., 4% annually → monthly = 4/12)
    void applyInterest() {
        double rate = 0.04 / 12;
        double interest = balance * rate;
        balance += interest;
        System.out.println("Monthly Interest Added: " + interest);
    }

    // Display account details
    void display() {
        System.out.println("\n===== ACCOUNT DETAILS =====");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

public class bankAccount_oops{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();

        System.out.print("Enter Initial Balance: ");
        double bal = sc.nextDouble();

        System.out.print("Enter Transaction Limit: ");
        double limit = sc.nextDouble();

        BankAccount acc = new BankAccount(accNo, bal, limit);

        // Operations
        System.out.print("Enter deposit amount: ");
        double dep = sc.nextDouble();
        acc.deposit(dep);

        System.out.print("Enter withdrawal amount: ");
        double wd = sc.nextDouble();
        acc.withdraw(wd);

        // Apply interest
        acc.applyInterest();

        // Display final details
        acc.display();

        sc.close();
    }
}
