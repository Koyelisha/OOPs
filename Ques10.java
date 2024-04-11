// Parent class
class Parent {
    int parentVar;

    // Constructor of Parent class
    Parent(int var) {
        this.parentVar = var;
        System.out.println("Parent class constructor called");
    }
}

// Child class inheriting from Parent class
class Child extends Parent {
    int childVar;

    // Constructor of Child class
    Child(int var1, int var2) {
        super(var1); // Calling superclass constructor
        this.childVar = var2;
        System.out.println("Child class constructor called");
    }

    void display() {
        System.out.println("Parent variable: " + parentVar);
        System.out.println("Child variable: " + childVar);
    }
}

// Main class
public class Ques10 {
    public static void main(String[] args) {
        Child obj = new Child(10, 20);
        obj.display();
    }
}
