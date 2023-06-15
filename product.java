import java.util.Scanner;
public class product {
        public static void main(String args[] ) throws Exception {
            Scanner sc=new Scanner(System.in);
            int len=sc.nextInt();
            int product=1;
            int[]arr=new int[len];
            for(int i=0;i<=len-1;i++)
            {
                arr[i]=sc.nextInt();
            }
            System.out.println(arr);
            for(int i=0;i<=len-1;i++)
            {
                product=product*(arr[i]%(10^9+7));
            }
        // System.out.println(product);
        }
} 
