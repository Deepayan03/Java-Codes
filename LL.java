class LL {
    NODE head=null;
    class NODE{
        int data;
        NODE next;
        NODE(int d)
        {
            this.data=d;
            this.next=null;
        }
    }
   
    public void insertFirst(int key){
       NODE newnode=new NODE(key);
            newnode.next=head;
            head=newnode;
        }
    public void insertLast(int key)
    {
        NODE newnode=new NODE(key);
        if(head==null)
        {
            head=newnode;
        }
        else{
            NODE temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=newnode;
        }
    }
    public void printList()
    {
        NODE temp=head;
        while(temp!=null){
            System.out.println(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("NULL");
    }
    public static void main(String args[]){
        LL l=new LL();
        l.insertFirst(10);
        l.insertFirst(20);
        l.insertLast(20);
        l.insertLast(10);
        l.printList();
    } 
}
