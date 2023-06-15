public class Bubblesort {
    static void bubblesort(int arr[],int n)
    {
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[]=new int[args.length];
        for(int i=0;i<args.length;i++)
        {
            arr[i]=Integer.parseInt(args[i]);
        }
        bubblesort(arr,arr.length);
        for(int i=0;i<args.length;i++)
        {
            System.out.println("   "+arr[i]);
        }
    }
}
