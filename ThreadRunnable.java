class Thread1 implements Runnable{
    public void run(){
        while(true){
            System.out.println("I am thread one");
        }
    }
}
class Thread2 implements Runnable{
    public void run(){
        while (true) {
            System.out.println("I am thread two");
        }
    }
}
public class ThreadRunnable {
    public static void main(String[] args) {
    Thread1 t1=new Thread1();
    Thread2 t2=new Thread2();
    Thread tt1=new Thread(t1);
    Thread tt2=new Thread(t2);
    tt1.start();
    tt2.start();
    }
    
}
