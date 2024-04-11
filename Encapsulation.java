class A{
    private int a;
    private String str;
    //Getter and setter method for int
    public void set(int a){
        this.a = a;
    }
    public int get(){
        return a;
    }
    //Getter and setter method for string
    public void setString(String str){
        this.str = str;
    }
    public String Get(){
        return str;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        A obj = new A();
        obj.set(5);
        int l = obj.get();
        System.out.println(l);
        obj.setString("Koyel");
        String b = obj.Get();
        System.out.println(b);
    }
}
