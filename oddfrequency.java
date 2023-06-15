public class oddfrequency 
{
    public static void main(String[] args) 
    {
        int arr[]= new int[args.length];
        int freq[]=new int[args.length];
        int sum=0;
        for(int j=0;j<args.length;j++)
            {
                    arr[j]= Integer.parseInt(args[j]); 
            }
           
                
            int visited = -1;
            for(int i = 0; i < args.length; i++)
            {    
                int count = 1;    
                for(int j = i+1; j <args.length; j++){    
                    if(arr[i] == arr[j])
                    {    
                        count++;    
                        //To avoid counting same element again    
                        freq[j] = visited;    
                    }    
                }    
                if(freq[i] != visited)    
                    freq[i] = count;  
                    
                    if(freq[i]%2==1)
                    {
                        sum=sum+arr[i]*freq[i];
                    }
            }

        System.out.print("The sum of odd elements are  "+sum);
                  
              
    }
}
