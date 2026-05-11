// Parent class
class Shape {

    // Method to calculate area
    double calculateArea() {
        return 0;
    }
}

// Rectangle class
class Rectangle extends Shape {

    double length;
    double width;

    // Constructor
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Overriding calculateArea() method
    @Override
    double calculateArea() {
        return length * width;
    }
}

// Triangle class
class Triangle extends Shape {

    double base;
    double height;

    // Constructor
    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Overriding calculateArea() method
    @Override
    double calculateArea() {
        return 0.5 * base * height;
    }
}

// Main class
public class area_calculator{

    public static void main(String[] args) {

        // Object of Rectangle class
        Rectangle r = new Rectangle(10, 5);

        // Object of Triangle class
        Triangle t = new Triangle(8, 4);

        System.out.println("Area of Rectangle: " +
                           r.calculateArea());

        System.out.println("Area of Triangle: " +
                           t.calculateArea());
    }
}