// Parent class
class Vehicle {

    // Method to drive vehicle
    void drive() {
        System.out.println("Driving a vehicle");
    }
}

// Car class
class Car extends Vehicle {

    // Overriding drive() method
    @Override
    void drive() {
        System.out.println("Driving a car");
    }
}

// Bike class
class Bike extends Vehicle {

    // Overriding drive() method
    @Override
    void drive() {
        System.out.println("Driving a bike");
    }
}

// Main class
public class vehicle3{

    public static void main(String[] args) {

        // Object of Vehicle class
        Vehicle v = new Vehicle();

        // Object of Car class
        Car c = new Car();

        // Object of Bike class
        Bike b = new Bike();

        // Calling methods
        v.drive();
        c.drive();
        b.drive();
    }
}
/* 
o/p
Driving a vehicle
Driving a car
Driving a bike  */