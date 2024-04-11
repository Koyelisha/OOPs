import org.w3c.dom.ls.LSOutput;

class Myclass{
    static int staticVar;
    public void increment(){
        staticVar++;
    }
    public int getStaticVar(){
        return staticVar;
    }
}

public class instances {
    public static void main(String[] args) {
        Myclass obj1 = new Myclass();
        Myclass obj2 = new Myclass();
        System.out.println(obj1.getStaticVar());
        obj1.increment();
        System.out.println(obj2.getStaticVar());

    }
}
