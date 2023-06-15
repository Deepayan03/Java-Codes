public class Maxandmin {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        int max=0;
        int min=0;
        for(int i=0;i<=arr.length;i++)
        {
            if(arr[i]>arr[i+1])
            {
            max=arr[i];
            }
            if(arr[i]>arr[i+1])
            {
                min=arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
