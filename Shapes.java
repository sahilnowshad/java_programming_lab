import java.util.Scanner;

public class Shapes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Circle
        System.out.print("Enter radius of circle: ");
        double radius = sc.nextDouble();

        double circleArea = Math.PI * radius * radius;
        double circlePerimeter = 2 * Math.PI * radius;

        System.out.println("\n--- Circle ---");
        System.out.println("Area = " + circleArea);
        System.out.println("Perimeter = " + circlePerimeter);

        // Rectangle
        System.out.print("\nEnter length of rectangle: ");
        double length = sc.nextDouble();

        System.out.print("Enter width of rectangle: ");
        double width = sc.nextDouble();

        double rectangleArea = length * width;
        double rectanglePerimeter = 2 * (length + width);

        System.out.println("\n--- Rectangle ---");
        System.out.println("Area = " + rectangleArea);
        System.out.println("Perimeter = " + rectanglePerimeter);

        sc.close();
    }
}