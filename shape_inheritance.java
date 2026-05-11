// Parent class
class Shape {

    // Method to return area
    double getArea() {
        return 0;
    }
}

// Child class
class Rectangle extends Shape {

    double length;
    double width;

    // Constructor
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Overriding getArea() method
    @Override
    double getArea() {
        return length * width;
    }
}

// Main class
public class shape_inheritance{
    public static void main(String[] args) {

        // Object of Shape class
        Shape s = new Shape();
        System.out.println("Area of Shape: " + s.getArea());

        // Object of Rectangle class
        Rectangle r = new Rectangle(10, 5);
        System.out.println("Area of Rectangle: " + r.getArea());
    }
}
/*o/p
area of shape:0.0
area of rectangle:50.0 */