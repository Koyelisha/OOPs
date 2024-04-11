abstract class shape{
    abstract void draw();
    //concrete method
    void display(){
        System.out.println("This is a shape");
    }
}
//concrete class
class Circle extends shape{
    void draw(){
        System.out.println("This is circle");
    }
}
//concrete class
class Rectangle extends shape{
    void draw(){
        System.out.println("This is rectangle");
    }
}

public class Ques3{
    public static void main(String[] args){
        Circle c = new Circle();
        Rectangle r = new Rectangle();
        c.draw();
        c.display();
        r.draw();
        r.display();
       
    }
}