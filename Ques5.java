class shape{
    void draw(){
        System.out.println("This is a shape");
    }
}
class Circle extends shape{
    void draw(){
        System.out.println("This is a Circle");
    }
}
class Rectangle extends shape{
    void draw(){
        System.out.println("This is a Rectangle");
    }
}
public class Ques5{
    public static void main(String[] args){
       shape s = new shape();
       Circle c = new Circle();
       Rectangle r = new Rectangle();
       shape ob;
       ob = s;
       ob.draw();
       ob = c;
       ob.draw();
       ob = r;
       ob.draw();
       
    }
} 
