class student{
    String name;
    int ID;
    int age;
    student(String n,int i){
        name = n;
        ID = i;
    }
    student(String n,int i,int a){
        name = n;
        ID = i;
        age = a;
    }
    void display(){
        System.out.println(name+" "+ID+" "+age);
    }
}
public class ConSrOverloading{
    public static void main(String[] args){
        student s = new student("Koyelisha",67);
        s.display();
        student s1 = new student("Koyel",189,19);
        s1.display();
    }
}
