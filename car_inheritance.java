// Parent class
class Vehicle {

    // Method in parent class
    void start() {
        System.out.println("Vehicle started");
    }
}

// Child class inheriting Vehicle
class Car extends Vehicle {

    // Overriding start() method
    @Override
    void start() {
        System.out.println("Car started");
    }
}

// Main class
public class car_inheritance{
    public static void main(String[] args) {

        // Object of Vehicle class
        Vehicle v = new Vehicle();
        v.start();

        // Object of Car class
        Car c = new Car();
        c.start();
    }
}
/* output is vehical started
   car started  */