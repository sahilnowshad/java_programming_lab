import java.util.Scanner;

class ElectricityBill {
    String consumerType;
    int units;

    double billAmount = 0;
    double tax = 0;
    double subsidy = 0;
    double lateFee = 0;

    // Constructor
    ElectricityBill(String type, int u) {
        consumerType = type;
        units = u;
    }

    // Method to calculate bill using slab rates
    void calculateBill() {
        if (units <= 100) {
            billAmount = units * 2;
        } 
        else if (units <= 200) {
            billAmount = (100 * 2) + (units - 100) * 3;
        } 
        else if (units <= 300) {
            billAmount = (100 * 2) + (100 * 3) + (units - 200) * 5;
        } 
        else {
            billAmount = (100 * 2) + (100 * 3) + (100 * 5) + (units - 300) * 7;
        }
    }

    // Method to apply tax, subsidy, and late fee
    void applyCharges(boolean isLate) {

        // Tax = 10% of bill
        tax = 0.10 * billAmount;

        // Subsidy based on consumer type
        if (consumerType.equalsIgnoreCase("domestic")) {
            subsidy = 0.05 * billAmount; // 5% subsidy
        } else {
            subsidy = 0; // no subsidy for commercial
        }

        // Late fee
        if (isLate) {
            lateFee = 50;
        } else {
            lateFee = 0;
        }
    }

    // Final amount
    void generateBill() {
        double finalAmount = billAmount + tax + lateFee - subsidy;

        System.out.println("\n----- Electricity Bill -----");
        System.out.println("Consumer Type: " + consumerType);
        System.out.println("Units Consumed: " + units);
        System.out.println("Base Bill: " + billAmount);
        System.out.println("Tax (10%): " + tax);
        System.out.println("Subsidy: " + subsidy);
        System.out.println("Late Fee: " + lateFee);
        System.out.println("Final Payable Amount: " + finalAmount);
    }
}

// Main class
public class electricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter Consumer Type (Domestic/Commercial): ");
        String type = sc.next();

        System.out.print("Enter Units Consumed: ");
        int units = sc.nextInt();

        System.out.print("Is payment late? (true/false): ");
        boolean isLate = sc.nextBoolean();

        // Object creation
        ElectricityBill obj = new ElectricityBill(type, units);

        obj.calculateBill();
        obj.applyCharges(isLate);
        obj.generateBill();
    }
}