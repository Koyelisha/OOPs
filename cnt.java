class Counter{
    static int count;
    Counter(){
        count++;
    }
    public void retrieve(){
        System.out.println("Instance no "+count);
    }
}
public class cnt {
    public static void main(String[] args){
        Counter c1 = new Counter();
        c1.retrieve();
        Counter c2 = new Counter();
        c2.retrieve();
        Counter c3 = new Counter();
        c3.retrieve();
    }
}
