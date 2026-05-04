import java.util.Scanner;

class Interest {
    double principal;
    double rate;
    double time;

    // Constructor
    Interest(double p, double r, double t) {
        principal = p;
        rate = r;
        time = t;
    }

    // Method to calculate Simple Interest
    double calculateSI() {
        return (principal * rate * time) / 100;
    }

    // Method to calculate Compound Interest
    double calculateCI() {
        double amount = principal * Math.pow((1 + rate / 100), time);
        return amount - principal;
    }

    // Method to compare and display results
    void compareInterest() {
        double si = calculateSI();
        double ci = calculateCI();

        System.out.println("\n--- Interest Details ---");
        System.out.println("Simple Interest = " + si);
        System.out.println("Compound Interest = " + ci);

        double difference = ci - si;
        System.out.println("Difference (CI - SI) = " + difference);

        if (ci > si) {
            System.out.println("Compound Interest gives higher returns.");
        } else if (si > ci) {
            System.out.println("Simple Interest gives higher returns.");
        } else {
            System.out.println("Both give equal returns.");
        }
    }
}

// Main class
public class interust {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter Principal: ");
        double p = sc.nextDouble();

        System.out.print("Enter Rate (%): ");
        double r = sc.nextDouble();

        System.out.print("Enter Time (years): ");
        double t = sc.nextDouble();

        // Object creation
        Interest obj = new Interest(p, r, t);

        // Method call
        obj.compareInterest();
    }
}