import java.util.Scanner;
public class Percentage 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total marks");
        int total , marks ,subject1,subject2,subject3,subject4,subject5,percentage;
        total= sc.nextInt();
        System.out.println("Enter the  marks of 1st subject");
        subject1= sc.nextInt();
        System.out.println("Enter the  marks of 2nd subject");
        subject2= sc.nextInt();
        System.out.println("Enter the  marks of 3rd subject");
        subject3= sc.nextInt();
        System.out.println("Enter the  marks of 4th subject");
        subject4= sc.nextInt();
        System.out.println("Enter the  marks of 5th subject");
        subject5= sc.nextInt();
       marks=subject1+subject2+subject3+subject4+subject5;
       percentage=marks*100/total;
       System.out.println("Student has got   marks"+marks+);
       System.out.println("Student has got    percent "+percentage+);
    }
    
}
