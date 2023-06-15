import java.util.Scanner;
private class Freq1{
    public static void showfreq(int arr[],int element){
        int count=0;
        int i=0;
        for(i=0;i<arr.length;i++){
            if(arr[i]==element){
                count++;
            }
        }
        System.out.println("The frequency of the"+element+ " is "+count);
    }
}
public class Frequency{
    public static void main(String[] args) {
        Freq1 s=new Freq1();
        Scanner sc=new Scanner(System.in);
        int element=sc.nextInt();
        int [] arr =new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        s.showfreq(arr,element);
    }
}

