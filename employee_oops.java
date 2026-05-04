import java.util.Scanner;

class Employee {
    double basicSalary;
    int overtimeHours;
    int leaveDays;

    double hra, da, bonus, tax, overtimePay, leaveDeduction;
    double grossSalary, netSalary;

    // Constructor
    Employee(double basic, int overtime, int leave) {
        basicSalary = basic;
        overtimeHours = overtime;
        leaveDays = leave;
    }

    // Calculate allowances
    void calculateAllowances() {
        hra = 0.20 * basicSalary;   // 20% HRA
        da = 0.10 * basicSalary;    // 10% DA
        overtimePay = overtimeHours * 200; // ₹200 per hour
        leaveDeduction = leaveDays * 500;  // ₹500 per day
    }

    // Calculate bonus and tax based on slabs
    void calculateBonusAndTax() {
        if (basicSalary < 30000) {
            bonus = 0.05 * basicSalary;
            tax = 0.02 * basicSalary;
        } else if (basicSalary <= 60000) {
            bonus = 0.10 * basicSalary;
            tax = 0.05 * basicSalary;
        } else {
            bonus = 0.15 * basicSalary;
            tax = 0.10 * basicSalary;
        }
    }

    // Calculate gross and net salary
    void calculateSalary() {
        calculateAllowances();
        calculateBonusAndTax();

        grossSalary = basicSalary + hra + da + bonus + overtimePay;
        netSalary = grossSalary - (tax + leaveDeduction);
    }

    // Display details
    void display() {
        System.out.println("\n===== EMPLOYEE SALARY DETAILS =====");
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Bonus: " + bonus);
        System.out.println("Overtime Pay: " + overtimePay);
        System.out.println("Leave Deduction: " + leaveDeduction);
        System.out.println("Tax: " + tax);
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("Net Salary: " + netSalary);
    }
}

public class employee_oops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter Basic Salary: ");
        double basic = sc.nextDouble();

        System.out.print("Enter Overtime Hours: ");
        int overtime = sc.nextInt();

        System.out.print("Enter Leave Days: ");
        int leave = sc.nextInt();

        // Create object
        Employee emp = new Employee(basic, overtime, leave);

        // Calculate salary
        emp.calculateSalary();

        // Display result
        emp.display();

        sc.close();
    }
}
