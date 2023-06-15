//Write a program to print three lists of all those numbers from 1 to 100 which are divisible by 3, 6 and both.
public class Divisible
{
    public static void main(String[]args)
    {
        int i;
        System.out.println("The first list is  :");
        for(i=1;i<100;i++)
        {
            if(i%3==0)
            {
                System.out.print(i+"    ");
            }
        }
        System.out.println("\nThe second list is  :");
        for(i=1;i<100;i++)
        {
            if(i%6==0)
            {
                System.out.print(i+"    ");
            }
        }
        System.out.println("\nThe third list is  :");
        for(i=1;i<100;i++)
        {
            if(i%3==0 && i%6==0)
            {
                System.out.print(i+"    ");
            }
        }

    }
    
}
