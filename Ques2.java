class Animal{
    String name;
    Animal(String name){
        this.name = name;
    }
    void Sound(){
        System.out.println("Animal Sound");
    }
}

class Dog extends Animal{
    String breed;
    Dog(String name,String breed){
        super(name);
        this.breed = breed;
    }
    void Bark(){
        System.out.println("Dog Barking");
    }
}

public class Ques2{
    public static void main(String[] args){
        Animal a = new Animal("Bobby");
        a.Sound();
        Dog b= new Dog("Bobby","Pomerian");
        b.Bark();
    }
}