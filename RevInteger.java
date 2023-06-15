import java.util.Scanner;
public class RevInteger {
    public static int reverse(long x) {
        long rem=0,rev=0;
        while(x!=0){
            rem=x%10;
            rev=rev*10+rem;
            x=x/10;
        }
        if(rev<=Integer.MIN_VALUE || rev>=Integer.MAX_VALUE){
            return 0;
        }
        return (int)rev;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(reverse(sc.nextLong()));
    }
}
    

