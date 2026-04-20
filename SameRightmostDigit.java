import java.util.Scanner;

public class SameRightmostDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input three non-negative integers
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        // Get rightmost digits
        int d1 = a % 10;
        int d2 = b % 10;
        int d3 = c % 10;

        // Check condition
        boolean result = (d1 == d2) || (d2 == d3) || (d1 == d3);

        // Output
        System.out.println(result);

        sc.close();
    }
}