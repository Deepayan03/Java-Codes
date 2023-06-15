import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        int a=0, b=1 ,n;
        int c=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=2;i<=n;i++)
        {
            c=a+b;
            a=b;
            b=c;
        }
        System.out.println(b);
    }
}
