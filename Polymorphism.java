import java.util.Scanner;
public class Polymorphism {
    void sum(int a,int b){
        System.out.println("The sum: "+(a+b));
    }
    void sum(int a,int b,int c){ //Method overloading by changing the no of arguments
        System.out.println("The sum: "+(a+b+c));
    }
    void sum(double a,double b){//Method overloading by changing the data types
        System.out.println("The sum: "+(a+b));
    }
    public static void main(String[] args){
        int a,b,c;
        double l,m;
        int n;
        Polymorphism p = new Polymorphism();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 or 0 or -1: ");
        n = sc.nextInt();
        if(n==1){
            System.out.println("Enter num1: ");
            a = sc.nextInt();
            System.out.println("Enter num2: ");
            b = sc.nextInt();
            p.sum(a,b);
        }else if(n==0){
            System.out.println("Enter num1: ");
            a = sc.nextInt();
            System.out.println("Enter num2: ");
            b = sc.nextInt();
            System.out.println("Enter num3: ");
            c = sc.nextInt();
            p.sum(a,b,c);
        }else{
            System.out.println("Enter floating point num1: ");
            l = sc.nextDouble();
            System.out.println("Enter floating point num2: ");
            m = sc.nextDouble();
            p.sum(l,m);
        }

    }
}
