import java.util.Scanner;

public class EvenOddCheck {
    public static void main(String[] args) {
      try ( Scanner sc = new Scanner(System.in);){

        // Input
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Check even or odd
        if (num % 2 == 0) 
            System.out.println(1); // Even
         else 
            System.out.println(0); // Odd
        

        sc.close();
        }
    }
}