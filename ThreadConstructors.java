class thread1 extends Thread{
    public void run(){
       // while(true){
            System.out.println("I am eating");
        //}
    }
    public thread1(String name)
    {
        super(name);
    }
}
/*class thread2 extends Thread{
    public void run(){
        while(true){
            System.out.println("Iam playing genshin");
        }
    }
}*/
public class ThreadConstructors{
    public static void main(String[] args) {
    thread1 t1 = new thread1("Deepayan");
    t1.start();
    System.out.println("Name is "+t1.getName());
    System.out.println(t1.getId());
    //t1.sleep(1000);
    
    //thread2 t2 = new thread2();
   // t2.start();
    //t2.sleep(1000);
    }  
}
