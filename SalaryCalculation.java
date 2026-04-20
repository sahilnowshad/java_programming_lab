import java.util.Scanner;

public class SalaryCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter basic salary: ");
        double basic = sc.nextDouble();

        double hra, da, tax = 0;

        // HRA calculation
        if (basic <= 20000) {
            hra = 0.20 * basic;
        } else {
            hra = 0.30 * basic;
        }

        // DA calculation
        da = 0.80 * basic;

        // Gross salary
        double gross = basic + hra + da;

        // Tax calculation
        if (gross > 50000) {
            tax = 0.10 * gross;
        }

        // Net salary
        double net = gross - tax;

        // Output
        System.out.println("HRA = " + hra);
        System.out.println("DA = " + da);
        System.out.println("Gross Salary = " + gross);
        System.out.println("Tax = " + tax);
        System.out.println("Net Salary = " + net);

        sc.close();
    }
}
