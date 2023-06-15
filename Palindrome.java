import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int temp=num,tot=0;
        int rev=0;
        while(num>0)
        {
            rev=num%10;
            tot=(tot * 10)+rev;
            num=num/10;

        }
        if(temp==tot)
        System.out.println("Palindrome");
        else
        System.out.println("Not Palindrome");
    }
}
