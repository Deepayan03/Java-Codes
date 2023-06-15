public class running_sum {
    public static int runsum(int arr[],int len){
        int[] arr2=new int[len];
        int i=0;
        while(i<=len){
            if(i==0)
            {
                return arr[i];
            }
            arr[i]=arr[i]+arr[i+1];
            i++;
            return arr[i];
            
        }
        return 0;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int len=arr.length;
       for(int i=0;i<len;i++)
       {
        arr[i]=runsum(arr, len);
        System.out.println(arr[i]);
       }
    }
    
}
// Input: nums = [1,2,3,4]
// Output: [1,3,6,10]
// Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
