import java.util.Arrays;
class findminmax{
    public int min=0;
    public int max=0;
}
public class minmax{
    public static findminmax findnum(int[]arr,int n){
        findminmax m=new findminmax();
        Arrays.sort(arr);
        m.min=arr[0];
        m.max=arr[n];

        return m;
    }
    public static void main(String args[]){
        int arr[]={10,20,30,40,50};
        findminmax c=findnum(arr,arr.length-1);
        System.out.println("The maximum number is "+c.max);
        System.out.println("The minimum number is "+c.min);
    }
}