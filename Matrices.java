import java.util.Scanner;
public class Matrices {
    public static void main(String[] args) {
        int[][] arr = new int [10][20];
        int[][] arr1 = new int [10][20];
        int[][] arr2 = new int [10][20];
        Scanner sc= new Scanner(System.in);
        System.out.println("Rows");
        int rows=sc.nextInt();
        System.out.println("Coloumns");
        int coloumns=sc.nextInt();
        System.out.println("Enter the elements of 1st Matrix");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<coloumns;j++)
            {
                arr[i][j]=sc.nextInt();

            }
        }
        display(arr,rows,coloumns);
        System.out.println("Enter the elements of 2nd Matrix");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<coloumns;j++)
            {
                arr1[i][j]=sc.nextInt();

            }
        }
        display(arr1,rows,coloumns);
        System.out.println("The resultant matrix after adding is______");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<coloumns;j++)
            {
                arr2[i][j]=arr1[i][j]+arr[i][j];

            }
        }
        display(arr2,rows,coloumns);
        

    } 
    static void display(int arr[][], int rows,int coloumns)
    {
        System.out.println("You have entered -----");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<coloumns;j++)
            {
                System.out.print("   "+arr[i][j]);
            }
             System.out.println(" ");
        }
    }
}