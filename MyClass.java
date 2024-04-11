class Animal{
    String name;
    Animal(String name){
        this.name = name;
    }
    void eat(){
        System.out.println(this.name+" is eating");
    }
}
class Dog extends Animal{
    Dog(String name){
        super(name);
    }
    void bark(){
        System.out.println(name+" is barking");
    }
}
public class MyClass {
    public static void main(String args[]) {
        Dog d = new Dog("Honey");
        d.bark();
       Animal a = new Animal("Bobby");
       a.eat();
      a.bark();
    }
}
