import java.util.Scanner;
class Solution {
    public int mySqrt(int x) {
        long low = 0;
        long high = x;
        while (low <= high) {
            long mid = (low + high) / 2;
            if (mid * mid == x) {
                return (int) mid;
            }
            if (mid * mid < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return (int)high ;
    }
}
public class SquareRoot{
    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(sol.mySqrt(x));
    }
}