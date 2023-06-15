//Write a Java program to compute the area of a hexagon. The length of a side must be taken as an input from keyboard
import java.util.Scanner;
public class Areaofhexagon 
{
    public static void main(String args[])
    {
        System.out.println("Enter the length of the hexagon");
        Scanner input = new Scanner(System.in);
        double s=input.nextDouble();
        double area = (6*(s*s))/(4*Math.tan(Math.PI/6));
        System.out.println("The area of the hexagon is:   "+area);
    }
}