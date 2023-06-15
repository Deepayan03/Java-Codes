import java.util.Scanner;
public class AddTwoNumbers
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in); 
        int a,b,c,d;
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();
        d=a+b+c;

        System.out.println("The result is  "+d);
    }
}