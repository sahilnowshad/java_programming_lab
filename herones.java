import java.util.Scanner;

class Triangle {
    double a, b, c;

    // Constructor
    Triangle(double x, double y, double z) {
        a = x;
        b = y;
        c = z;
    }

    // Method to check if valid triangle
    boolean isValid() {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    // Method to find type of triangle
    void findType() {
        if (a == b && b == c) {
            System.out.println("Triangle is Equilateral.");
        } else if (a == b || b == c || a == c) {
            System.out.println("Triangle is Isosceles.");
        } else {
            System.out.println("Triangle is Scalene.");
        }
    }

    // Method to calculate area using Heron's Formula
    double getArea() {
        double s = (a + b + c) / 2; // semi-perimeter
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}

public class herones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input sides
        System.out.print("Enter three sides of triangle: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        // Create object
        Triangle t = new Triangle(a, b, c);

        // Validate triangle
        if (t.isValid()) {
            System.out.println("Valid Triangle");

            // Type
            t.findType();

            // Area
            System.out.println("Area of Triangle: " + t.getArea());
        } else {
            System.out.println("Invalid Triangle (Triangle inequality not satisfied)");
        }

        sc.close();
    }
}