import java.util.*;

class Calculator {
    double num1, num2;
    char op;

    String history[] = new String[5];
    int index = 0;

    void setValues(double a, double b, char operator) {
        num1 = a;
        num2 = b;
        op = operator;
    }

    void calculate() {
        double result;

        if (op == '+') {
            result = num1 + num2;
        } 
        else if (op == '-') {
            result = num1 - num2;
        } 
        else if (op == '*') {
            result = num1 * num2;
        } 
        else if (op == '/') {
            if (num2 == 0) {
                System.out.println("Division by zero not allowed!");
                return;
            }
            result = num1 / num2;
        } 
        else {
            System.out.println("Invalid operator!");
            return;
        }

        System.out.println("Result = " + result);

        // store history (max 5)
        history[index % 5] = num1 + " " + op + " " + num2 + " = " + result;
        index++;
    }

    void showHistory() {
        System.out.println("\nLast Calculations:");
        for (int i = 0; i < 5; i++) {
            if (history[i] != null) {
                System.out.println(history[i]);
            }
        }
    }
}

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator c = new Calculator();

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter first number: ");
            double a = sc.nextDouble();

            System.out.print("Enter operator (+ - * /): ");
            char op = sc.next().charAt(0);

            System.out.print("Enter second number: ");
            double b = sc.nextDouble();

            c.setValues(a, b, op);
            c.calculate();
        }

        c.showHistory();
    }
}
