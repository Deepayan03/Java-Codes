class Thread1 extends Thread{
    public void run(){
        while(true){
            System.out.println("I am the most important thread");
        }
    }
}
class Thread2 extends Thread{
    public void run(){
        while(true){
            System.out.println("I am not important");
        }
    }
}
class Thread3 extends Thread{
    public void run(){
        while(true){
            System.out.println("I have minimum importance");
        }
    }
}
public class Thread_priority {
    public static void main(String[] args) {
    Thread1 t1= new Thread1();
    Thread2 t2= new Thread2();
    Thread3 t3= new Thread3();
    t1.setPriority(Thread.MAX_PRIORITY);
    t2.setPriority(Thread.MIN_PRIORITY);
    t1.start();
    t2.start();
    t3.start();
    }
}
