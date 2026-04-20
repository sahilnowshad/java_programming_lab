import java.util.Scanner;

public class SwapWithoutTemp {
    public static void main(String[] args) {
       try (Scanner sc = new Scanner(System.in);){

        int a, b;

        System.out.print("Enter first number: ");
        a = sc.nextInt();

        System.out.print("Enter second number: ");
        b = sc.nextInt();

        // Swapping without third variable
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        sc.close();
        }
    }
}