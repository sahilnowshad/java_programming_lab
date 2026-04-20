import java.util.Scanner;

public class AlternatingSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms (N): ");
        int n = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum -= i;   // even number → subtract
            } else {
                sum += i;   // odd number → add
            }
        }

        System.out.println("Result = " + sum);

        sc.close();
    }
}