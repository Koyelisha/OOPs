public class Calculator{
    int calculate(){
        System.out.println("Calculation in progress");
        return -1;
    }
}
class Add extends Calculator{
    int calculate(int i,int j){
        return i+j;
    }
}
class Sub extends Calculator{
    int calculate(int i,int j){
        return i-j;
    }
}
public class Ques9 {
    public static void main(String[] args){
   Calculator c = new Calculator();
   Add a = new Add();
   Sub s = new Sub();
   Calculator ob ;
   ob = a;
   System.out.println(ob.calculate(3,4));
   ob = b;
   System.out.println(ob.calculate(3,4));
       }
       
    }

