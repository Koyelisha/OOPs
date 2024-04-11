// Superclass
class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void makeSound() {
        System.out.println("Animal sound");
    }
}

// Subclass
class Dog extends Animal {
    String name; // Same name as superclass variable

    Dog(String name) {
        super(name); // Call superclass constructor
        this.name = "Dog: " + name; // Using this keyword to refer to subclass variable
    }

    void makeSound() {
        super.makeSound(); // Call superclass method
        System.out.println("Woof!");
    }

    void printNames() {
        System.out.println("Superclass name: " + super.name); // Accessing superclass variable
        System.out.println("Subclass name: " + this.name); // Accessing subclass variable
    }
}

public class namespace {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy");
        myDog.makeSound(); // Output: Animal sound\nWoof!
        myDog.printNames(); // Output: Superclass name: Buddy\nSubclass name: Dog: Buddy
    }
}


