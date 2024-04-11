import java.util.Scanner;
class Car{
    public int increment;
    public int decrement;
    public void speedup(int increment,int speed){
        this.increment = increment;
        speed = speed + increment;
        System.out.println("The speed: "+speed);
    }
    public void ApplyBrake(int decrement,int speed){
        this.decrement = decrement;
        speed = speed - decrement;
        System.out.println("The speed: "+speed);
    }

}

public class ne {
    public static void main(String[] args){
        int incre,speed,decre;
        Car c = new Car();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter current speed: ");
        speed = sc.nextInt();
        System.out.println("Enter incremented speed: ");
        incre = sc.nextInt();
        c.speedup(incre,speed);
        System.out.println("Enter decremented speed: ");
        decre = sc.nextInt();
        c.ApplyBrake(decre,speed);
    }
}
