import java.util.Scanner;

public class DigitPositionSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a 5-digit number: ");
        int num = sc.nextInt();

        int oddSum = 0;
        int evenSum = 0;
        int position = 1;  // position starts from right (units place)

        while (num > 0) {
            int digit = num % 10;

            if (position % 2 == 0) {
                evenSum += digit;
            } else {
                oddSum += digit;
            }

            num = num / 10;
            position++;
        }

        System.out.println("Odd position sum = " + oddSum);
        System.out.println("Even position sum = " + evenSum);
        System.out.println("Difference = " + Math.abs(oddSum - evenSum));
    }
}