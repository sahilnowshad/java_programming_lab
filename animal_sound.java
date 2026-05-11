// Parent class
class Animal {

    // Method to make sound
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class
class Mammal extends Animal {

    // Method to give birth
    void giveBirth() {
        System.out.println("Giving birth");
    }
}

// Grandchild class
class Dog extends Mammal {

    // Overriding makeSound() method
    @Override
    void makeSound() {
        System.out.println("Woof!");
    }
}

// Main class
public class animal_sound{

    public static void main(String[] args) {

        // Object of Animal class
        Animal a = new Animal();

        System.out.println("Animal Class:");
        a.makeSound();

        System.out.println();

        // Object of Mammal class
        Mammal m = new Mammal();

        System.out.println("Mammal Class:");
        m.makeSound();
        m.giveBirth();

        System.out.println();

        // Object of Dog class
        Dog d = new Dog();

        System.out.println("Dog Class:");
        d.makeSound();
        d.giveBirth();
    }
}
/* o/p
Animal Class:
Animal makes a sound

Mammal Class:
Animal makes a sound
Giving birth

Dog Class:
Woof!
Giving birth */
