import java.util.Scanner;
class Student{
    private String name;
    private int enrollment;
    //setter and getter method for name
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    //setter abd getter method for enrollment
    public void setEnrollment(int enrollment){
        this.enrollment = enrollment;
    }
    public int getEnrollment(){
        return enrollment;
    }
}

public class StudID {
    public static void main(String[] args){
        Student s1 = new Student();
        s1.setEnrollment(189);
        int enr = s1.getEnrollment();
        s1.setName("Koyelisha");
        String s = s1.getName();
        System.out.println(s + enr);

    }

}
