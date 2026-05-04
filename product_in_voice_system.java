import java.util.Scanner;

class Product {
    int productId;
    int quantity;
    double pricePerUnit;
    boolean isExpired;
    String discountCategory;

    double totalCost = 0;
    double discount = 0;
    double tax = 0;

    // Constructor
    Product(int id, int qty, double price, boolean expired, String category) {
        productId = id;
        quantity = qty;
        pricePerUnit = price;
        isExpired = expired;
        discountCategory = category;
    }

    // Calculate total cost
    void calculateTotal() {
        totalCost = quantity * pricePerUnit;
    }

    // Apply discount based on category
    void applyDiscount() {
        if (isExpired) {
            discount = 0.50 * totalCost; // 50% discount if expired
        } else {
            switch (discountCategory.toLowerCase()) {
                case "gold":
                    discount = 0.20 * totalCost;
                    break;
                case "silver":
                    discount = 0.10 * totalCost;
                    break;
                case "regular":
                    discount = 0.05 * totalCost;
                    break;
                default:
                    discount = 0;
            }
        }
    }

    // Apply tax (after discount)
    void applyTax() {
        double amountAfterDiscount = totalCost - discount;
        tax = 0.12 * amountAfterDiscount; // 12% tax
    }

    // Generate final invoice
    void generateInvoice() {
        double finalAmount = totalCost - discount + tax;

        System.out.println("\n------ PRODUCT INVOICE ------");
        System.out.println("Product ID: " + productId);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price per Unit: " + pricePerUnit);
        System.out.println("Total Cost: " + totalCost);
        System.out.println("Discount: " + discount);
        System.out.println("Tax (12%): " + tax);
        System.out.println("Final Payable Amount: " + finalAmount);
    }
}

// Main class
public class product_in_voice_system{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();

        System.out.print("Enter Quantity: ");
        int qty = sc.nextInt();

        System.out.print("Enter Price per Unit: ");
        double price = sc.nextDouble();

        System.out.print("Is Product Expired? (true/false): ");
        boolean expired = sc.nextBoolean();

        System.out.print("Enter Discount Category (Gold/Silver/Regular): ");
        String category = sc.next();

        // Object creation
        Product p = new Product(id, qty, price, expired, category);

        p.calculateTotal();
        p.applyDiscount();
        p.applyTax();
        p.generateInvoice();
    }
}