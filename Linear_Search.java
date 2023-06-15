import java.util.Scanner;
class Search{
    public  int find(int arr[],int element){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==element){
                return i;
            }
        }
        return -1;
    }
}
public class Linear_Search {
    public static void main(String[] args) {
        Search s=new Search();
        Scanner sc=new Scanner(System.in);
        int element=sc.nextInt();
        int [] arr =new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int index=s.find(arr, element);
        if(index==-1){
            System.out.println("Element not found");
        }
        else{
            System.out.println((index+1));
        }
    }
}
