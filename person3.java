// Parent class
class Person {

    // Method to speak
    void speak() {
        System.out.println("The person is speaking");
    }
}

// Student class
class Student extends Person {

    // Overriding speak() method
    @Override
    void speak() {
        System.out.println("The student is asking a question");
    }
}

// Teacher class
class Teacher extends Person {

    // Overriding speak() method
    @Override
    void speak() {
        System.out.println("The teacher is giving a lecture");
    }
}

// Main class
public class person3{

    public static void main(String[] args) {

        // Object of Person class
        Person p = new Person();

        // Object of Student class
        Student s = new Student();

        // Object of Teacher class
        Teacher t = new Teacher();

        // Calling methods
        p.speak();
        s.speak();
        t.speak();
    }
}
/*
o/p
The person is speaking
The student is asking a question
The teacher is giving a lecture */