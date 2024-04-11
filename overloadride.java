//super class
class animal{
    void makeSound(){
        System.out.println("Animal Sound");
    }
}
//sub class
class DOG extends animal{
    void makeSound(String barkType){
        System.out.println("Dog barking "+barkType);
    }
}
public class overloadride {
    public static void main(String[] args){
        animal a = new animal(); //object of super class
        a.makeSound();
        DOG b = new DOG();
        b.makeSound("Loudly");

    }
}
