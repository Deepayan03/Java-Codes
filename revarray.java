public class revarray {
    public static void rev_array(int[]arr){
        int i=0;
        int j=arr.length-1;
        int temp=0;
        for(i=0;i<arr.length/2;i++){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            j--;
        }
        for(i=0;i<arr.length;i++){
            System.out.print(arr[i]+"  ");
        }
    }
    public static void main(String args[]){
        int arr[]={10,20,30,40,50};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"  ");
        }
        System.out.println("  ");
        rev_array(arr);

    }
}
