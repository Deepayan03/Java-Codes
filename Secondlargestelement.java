//Write a program to Find the second largest number of an array. Supply the values to the array through command line argument.
public class Secondlargestelement 
{
    public static void main(String[]args)
    {
        int arr[]=new int[args.length];
        int max1=0,max2=0,i;
        for(int j=0;j<args.length;j++)
                {
                    arr[j]=Integer.parseInt(args[j]); 
                }
        
                
     for(i=0;i<args.length;i++)
            {
                if(arr[i]>max1) 
                {
                    max2 = max1;
                    max1=arr[i];
                }
                if(max2<arr[i] && arr[i]<max1)
                {
                    max2=arr[i];
                }
            }
            System.out.println(" The second largest element is: "+max2);  
    }
}
