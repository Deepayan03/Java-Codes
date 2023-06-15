class queueimplementation{
    int front=-1;
    int rear=-1;
    int size=5;
    int[] queue =new int[size];
    public void enqueue(int data){
        if(rear==size-1)
        {
            System.out.println("Queue is full");
        }
        else
        {
            rear++;
            queue[rear]=data;
        }
    }
    public int dequeue(){
        if(front==-1 && rear==-1)
        {
            System.out.println("Queue is empty");
            return -1;
        }
        else{
            front++;
            return queue[front];
        }
    }
        public void display(){
            System.out.println("Queue:");
            for(int i=front+1;i<=rear;i++)
            {
                System.out.print("    "+queue[i]);
            }
        }
}
public class queuearray{
    public static void main(String[] args) {
        queueimplementation q1 =new queueimplementation();
        q1.enqueue(10);
        q1.enqueue(20);
        q1.enqueue(30);
        q1.enqueue(40);
        q1.display();
        System.out.println(" ");
        System.out.println("Dequeued element is "+q1.dequeue());
        q1.display();
    }
}
