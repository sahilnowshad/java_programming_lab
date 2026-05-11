// Parent class
class Person {

    String name;
    int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display person details
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Child class
class Employee extends Person {

    double salary;

    // Constructor
    Employee(String name, int age, double salary) {
        super(name, age); // calling parent constructor
        this.salary = salary;
    }

    // Overriding display() method
    @Override
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}

// Main class
public class person_inheritance{
    public static void main(String[] args) {

        // Object of Person class
        Person p = new Person("Ali", 22);
        p.display();

        System.out.println();

        // Object of Employee class
        Employee e = new Employee("Sahil", 25, 50000);
        e.display();
    }
}
/* output
Name: Ali
Age: 22

Name: Sahil
Age: 25
Salary: 50000.0  */