import java.util.Scanner;

public class digitFrequency{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long num = sc.nextLong();

        int[] count = new int[10]; // array for digits 0–9

        // Count digits
        while (num > 0) {
            int digit = (int)(num % 10);
            count[digit]++;
            num = num / 10;
        }

        // Display result
        for (int i = 0; i < 10; i++) {
            if (count[i] > 0) {
                System.out.println(i + " → " + count[i] + " time(s)");
            }
        }

        sc.close();
    }
}
