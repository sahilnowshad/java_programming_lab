//Write a Java program to check whether a two-digit number is special. 
/*A number is special if: 
Sum of digits + Product of digits = original number 
Example: 
59 → 5+9 + 5×9 = 14 + 45 = 59*/
import java.util.Scanner;

public class SpecialNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a two-digit number: ");
        int num = sc.nextInt();

        // Extract digits
        int tens = num / 10;
        int ones = num % 10;

        // Calculate sum and product
        int sum = tens + ones;
        int product = tens * ones;

        // Check condition
        if ((sum + product) == num) {
            System.out.println("Special number");
        } else {
            System.out.println("Not a special number");
        }

        sc.close();
    }
}
