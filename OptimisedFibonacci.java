import java.util.Scanner;
public class OptimisedFibonacci {
    static int max = 10000;
    static long[] fib = new long[max];
    static int count=0;
    static long sum=0;
    public static long fibo(int n){
        count++;
        // System.out.print(count);
        if (n == 0) return 0;
        if (n == 1) return 1;

        if (fib[n] != 0) {
            return fib[n];    
        }
        fib[n] = fibo(n - 1) + fibo(n - 2);  
        return fib[n];

    }
    public static void displaycount(){
        System.out.println(count);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(fibo(sc.nextInt()));
        displaycount();
    }
}
