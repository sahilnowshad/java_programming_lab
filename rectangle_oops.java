import java.util.Scanner;

class Rectangle {
    double length, breadth;

    // Constructor
    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    // Method to calculate area
    double getArea() {
        return length * breadth;
    }

    // Method to calculate perimeter
    double getPerimeter() {
        return 2 * (length + breadth);
    }

    // Method to calculate diagonal
    double getDiagonal() {
        return Math.sqrt(length * length + breadth * breadth);
    }

    // Method to check if rectangle is square
    void isSquare() {
        if (length == breadth) {
            System.out.println("It is a Square.");
        } else {
            System.out.println("It is NOT a Square.");
        }
    }

    // Method to compare area
    void compareArea(Rectangle r) {
        if (this.getArea() > r.getArea()) {
            System.out.println("Rectangle 1 has larger area.");
        } else if (this.getArea() < r.getArea()) {
            System.out.println("Rectangle 2 has larger area.");
        } else {
            System.out.println("Both rectangles have equal area.");
        }
    }

    // Method to compare diagonal
    void compareDiagonal(Rectangle r) {
        if (this.getDiagonal() > r.getDiagonal()) {
            System.out.println("Rectangle 1 has longer diagonal.");
        } else if (this.getDiagonal() < r.getDiagonal()) {
            System.out.println("Rectangle 2 has longer diagonal.");
        } else {
            System.out.println("Both rectangles have equal diagonal.");
        }
    }
}

public class rectangle_oops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for rectangle 1
        System.out.print("Enter length and breadth of Rectangle 1: ");
        double l1 = sc.nextDouble();
        double b1 = sc.nextDouble();

        // Input for rectangle 2
        System.out.print("Enter length and breadth of Rectangle 2: ");
        double l2 = sc.nextDouble();
        double b2 = sc.nextDouble();

        // Creating objects
        Rectangle r1 = new Rectangle(l1, b1);
        Rectangle r2 = new Rectangle(l2, b2);

        // Display results
        System.out.println("\nRectangle 1 Area: " + r1.getArea());
        System.out.println("Rectangle 1 Perimeter: " + r1.getPerimeter());
        r1.isSquare();

        System.out.println("\nRectangle 2 Area: " + r2.getArea());
        System.out.println("Rectangle 2 Perimeter: " + r2.getPerimeter());
        r2.isSquare();

        // Comparison
        System.out.println();
        r1.compareArea(r2);
        r1.compareDiagonal(r2);

        sc.close();
    }
}
