class stackimplementation{
    int size;
    int top;
    int stack[];
    public stackimplementation(int size)
    {
        this.size=size;
        int top =-1;
        stack=new int[size];
    }
    public void push(int data)
    {
        if(top==size-1)
        System.out.println("Stack is full");
        else
        {
        top++;
        stack[top]=data;
        }
    }
    public int pop()
    {
        if(top==-1)
        {
        System.out.println("Stack is empty");
        return -1;
        }
        else
        {
        return stack[top--];
        }
    }
    public int peek()
    {
        return stack[top];
    }
    public void display(){
        System.out.println("Stack:");
        for(int i=0;i<top;i++)
        {
            System.out.println("   "+stack[i]);
        }
    }
}
public class stackarray{
    public static void main(String[] args) {
        stackimplementation s1 = new stackimplementation(5);
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);
        s1.push(50);
       System.out.println("Popped element is "+ s1.pop());
       System.out.println("Value of top is "+ s1.peek());
    }
}