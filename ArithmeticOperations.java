import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // Operations
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;

        // For division and remainder, check division by zero
        if (num2 != 0) {
            int division = num1 / num2;
            int remainder = num1 % num2;

            System.out.println("Division: " + division);
            System.out.println("Remainder: " + remainder);
        } else {
            System.out.println("Division and remainder not possible (division by zero)");
        }

        // Output results
        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + difference);
        System.out.println("Multiplication: " + product);

        sc.close();
    }
}
