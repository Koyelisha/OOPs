class a{
    String name;
    int ID;
    a(String name,int ID){
        this.name = name;
        this.ID = ID;
    }
    public void display(){
        System.out.println(name+" "+ID);
    }
}

public class th {
    public static void main(String[] args) {
        a obj = new a("Koyelisha", 5);
        obj.display();
    }
}
