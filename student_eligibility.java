class student {
    private String sname;
    private String semail;
    private long sphone;
    private int X;
    private int XII;
    private int sgrad;
    public void input(String name,String email,long phone,int sX,int sXII,int grad)
    {
        sname=name;
        semail=email;
        sphone=phone;
        X=sX;
        XII=sXII;
        sgrad=grad;
    }
    public boolean eligible(int criteria){
        if(X>=criteria && XII>=criteria && sgrad>=criteria)
        {
            return true;
        }
        return false;
    } 
    public void display()
    {
        System.out.println("Name:  "+sname);
        System.out.println("email:  "+semail);
        System.out.println("Contact : "+sphone);
        System.out.println("Marks: "+X);
        System.out.println("Marks: "+XII);
        System.out.println("Marks: "+sgrad);
        
        
    }
}
public class student_eligibility{
    public static void main(String[] args) {
        student Deepayan =new student();
        Deepayan.input("Deepayan Mukhopadhyay","mukhopadhyaydeepayan@gmail.com",9330648828l,60,73,95);
        Deepayan.display();
        if(Deepayan.eligible(60))
        {
            System.out.println("Student is eligible");
        }
        else{
            System.out.println("Student is not eligible");
        }

    }
}