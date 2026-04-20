import java.util.Scanner;

public class SeriesPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms (N): ");
        int n = sc.nextInt();

        int term = 2; // first term

        for (int i = 1; i <= n; i++) {
            System.out.print(term + " ");

            if (i % 2 != 0) {
                term = term * 3;  // odd step → ×3
            } else {
                term = term + 1;  // even step → +1
            }
        }

        sc.close();
    }
}