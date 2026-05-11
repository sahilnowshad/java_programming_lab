// Parent class
class Vehicle {

    // Method to start vehicle
    void start() {
        System.out.println("Vehicle started");
    }
}

// Child class
class Car extends Vehicle {

    // Method to drive car
    void drive() {
        System.out.println("Car driving");
    }
}

// Grandchild class
class SportsCar extends Car {

    // Overriding drive() method
    @Override
    void drive() {
        System.out.println("Sports car driving fast");
    }
}

// Main class
public class vehicle2{

    public static void main(String[] args) {

        // Object of Vehicle class
        Vehicle v = new Vehicle();

        System.out.println("Vehicle Class:");
        v.start();

        System.out.println();

        // Object of Car class
        Car c = new Car();

        System.out.println("Car Class:");
        c.start();
        c.drive();

        System.out.println();

        // Object of SportsCar class
        SportsCar s = new SportsCar();

        System.out.println("SportsCar Class:");
        s.start();
        s.drive();
    }
}
/* 
 o/p
 Vehicle Class:
Vehicle started

Car Class:
Vehicle started
Car driving

SportsCar Class:
Vehicle started
Sports car driving fast */