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

// Grandchild class
class Box extends Rectangle {

    double height;

    // Constructor
    Box(double length, double width, double height) {
        super(length, width);
        this.height = height;
    }

    // Overriding getArea() method
    // Surface Area of Box = 2(lw + lh + wh)
    @Override
    double getArea() {
        return 2 * ((length * width) +
                    (length * height) +
                    (width * height));
    }
}

// Main class
public class shape_inheritance2 {

    public static void main(String[] args) {

        // Object of Shape class
        Shape s = new Shape();

        System.out.println("Shape Area: " + s.getArea());

        // Object of Rectangle class
        Rectangle r = new Rectangle(10, 5);

        System.out.println("Rectangle Area: " + r.getArea());

        // Object of Box class
        Box b = new Box(10, 5, 4);

        System.out.println("Box Surface Area: " + b.getArea());
    }
}
/*
o/p
Shape Area: 0.0
Rectangle Area: 50.0
Box Surface Area: 220.0 */