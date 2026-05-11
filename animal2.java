// Parent class
class Animal {

    // Method to move
    void move() {
        System.out.println("The animal is moving");
    }
}

// Bird class
class Bird extends Animal {

    // Overriding move() method
    @Override
    void move() {
        System.out.println("The bird is flying");
    }
}

// Fish class
class Fish extends Animal {

    // Overriding move() method
    @Override
    void move() {
        System.out.println("The fish is swimming");
    }
}

// Main class
public class animal2 {

    public static void main(String[] args) {

        // Object of Animal class
        Animal a = new Animal();

        // Object of Bird class
        Bird b = new Bird();

        // Object of Fish class
        Fish f = new Fish();

        // Calling methods
        a.move();
        b.move();
        f.move();
    }
}
/* 
o/p
The animal is moving
The bird is flying
The fish is swimming */