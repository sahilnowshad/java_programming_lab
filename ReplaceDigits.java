import java.util.Scanner;

public class ReplaceDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int result = 0;
        int place = 1;

        while (num > 0) {
            int digit = num % 10;

            // Replace logic
            if (digit == 0) {
                digit = 1;
            } else if (digit == 1) {
                digit = 0;
            }

            result = result + digit * place;
            place = place * 10;
            num = num / 10;
        }

        System.out.println("Result = " + result);

        sc.close();
    }
}