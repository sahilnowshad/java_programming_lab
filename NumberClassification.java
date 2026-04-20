import java.util.Scanner;

public class NumberClassification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Positive / Negative / Zero
        if (num > 0) {
            System.out.println("Positive number");
        } else if (num < 0) {
            System.out.println("Negative number");
        } else {
            System.out.println("Zero");
        }

        // Even / Odd
        if (num % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }

        // Multiple of 5 or not
        if (num % 5 == 0) {
            System.out.println("Multiple of 5");
        } else {
            System.out.println("Not a multiple of 5");
        }

        // Three-digit or not
        if (num >= 100 && num <= 999 || num <= -100 && num >= -999) {
            System.out.println("Three-digit number");
        } else {
            System.out.println("Not a three-digit number");
        }

        sc.close();
    }
}
