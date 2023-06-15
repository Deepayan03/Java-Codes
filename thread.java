class thread1 extends Thread{
    public void run(){
        while(true){
            System.out.println("I am eating");
        }
    }
}
class thread2 extends Thread{
    public void run(){
        while(true){
            System.out.println("Iam playing genshin");
        }
    }
}
public class thread {
    public static void main(String[] args) {
    thread1 t1 = new thread1();
    t1.start();
    //t1.sleep(1000);
    thread2 t2 = new thread2();
    t2.start();
    //t2.sleep(1000);
    }  
}
