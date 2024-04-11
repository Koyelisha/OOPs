public class Ques6 implements Runnable{
    Thread t;
    Ques6(){
        t = new Thread();
        System.out.println("New thread has been created");
        t.start();
    }
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("New Thread "+i);
        }
    }
    public static void main(String[] args){
       new Ques6();
       for(int i=0;i<10;i++){
           System.out.println("Main Thread "+i);
       }
       
    }
}
