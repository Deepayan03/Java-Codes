import java.util.Scanner;
import java.util.Random;
class random_number{
    private int a;
    private int b;
    random_number()
    {
    Random rnd = new Random();
    a=rnd.nextInt(50);
    }
    public int getrandom()
    {
        return a;
    }
    public int user_input()
    {
        
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        b = sc.nextInt();
        return b;

    }
    public int change(int x)
    {
        Random rand = new Random();
        x=rand.nextInt(50);
        return x;
        
    }
    /* public int iscorrect()
    {

        if(get_entered()==getrandom())
        {
            return 1;
        }
        else if((get_entered()) > (getrandom()))
        {
            return 2;
        }
        else
        {
            return 3;
        }
    }*/

    

}
public class Take_a_guess{
    public static void main(String[] args) {
        random_number r= new random_number();
        int y=r.getrandom();
        while(true)
           {
            int x=r.user_input();
           if(x==y)
        {
            System.out.println("Congratulations you have guessed the correct number");
            System.out.println("The number is "+r.getrandom());
            System.out.println("A new game begins");
            y=r.change(r.getrandom());
 
        }
        else if((x) >y)
        {
            System.out.println("try smaller");
        }
        else if(x < y)
        {
            System.out.println("try larger");
        }

        }
    }
}

