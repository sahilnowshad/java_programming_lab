import java.util.Scanner;

class Circle {
    double radius;

    // Constructor
    Circle(double r) {
        radius = r;
    }

    // Method to calculate area
    double getArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate circumference
    double getCircumference() {
        return 2 * Math.PI * radius;
    }

    // Method to compare areas
    void compareArea(Circle c) {
        if (this.getArea() > c.getArea()) {
            System.out.println("Circle 1 has larger area.");
        } else if (this.getArea() < c.getArea()) {
            System.out.println("Circle 2 has larger area.");
        } else {
            System.out.println("Both circles have equal area.");
        }
    }

    // Method to check if one circle can fit inside another
    void canFitInside(Circle c) {
        if (this.radius < c.radius) {
            System.out.println("Circle 1 can fit inside Circle 2.");
        } else if (this.radius > c.radius) {
            System.out.println("Circle 2 can fit inside Circle 1.");
        } else {
            System.out.println("Both circles are of equal size, cannot fit.");
        }
    }
}

public class main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input radii
        System.out.print("Enter radius of Circle 1: ");
        double r1 = sc.nextDouble();

        System.out.print("Enter radius of Circle 2: ");
        double r2 = sc.nextDouble();

        // Create objects
        Circle c1 = new Circle(r1);
        Circle c2 = new Circle(r2);

        // Display results
        System.out.println("\nCircle 1 Area: " + c1.getArea());
        System.out.println("Circle 1 Circumference: " + c1.getCircumference());

        System.out.println("\nCircle 2 Area: " + c2.getArea());
        System.out.println("Circle 2 Circumference: " + c2.getCircumference());

        // Compare areas
        System.out.println();
        c1.compareArea(c2);

        // Check fitting
        c1.canFitInside(c2);

        sc.close();
    }
}