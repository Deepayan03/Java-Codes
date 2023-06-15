// Mathison recently inherited an ancient papyrus that contained some text. Unfortunately, the text was not a pangram. Now, Mathison has a particular liking for holoalphabetic strings and the text bothers him. The good news is that Mathison can buy letters from the local store in order to turn his text into a pangram.

// However, each letter has a price and Mathison is not very rich. Can you help Mathison find the cheapest way to obtain a pangram?

// Input
// The first line of the input file will contain one integer, T, representing the number of tests.

// Each test will be formed from two lines. The first one contains 26 space-separated integers, representing the prices of all letters. The second will contain Mathison's initial text (a string of N lowercase letters).
// Input
// 2
// 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26
// abcdefghijklmopqrstuvwz
// 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26
// thequickbrownfoxjumpsoverthelazydog


// Output
// 63
// 0

import java.util.*;
import java.lang.*;
import java.io.*;

/*Name of the class has to be "Main" only if the class is public. */
class Problem_codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int i=0;
		int t=0;
		int j=0;
        int k=0;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		while(t!=0)
		{
		    String num=sc.nextLine();
		    String str=sc.nextLine();
		    String s1=num.replaceAll(" ","");
		    String s2=str.replaceAll(" ","");
		    while(i<str.length()&& j<str.length())
		    {
            if(Integer.parseInt(s1.charAt(i))>=10)
            {
                i+=1;
            }
		    if(s1.charAt(i)-s2.indexof(charAt(j),"0")!=0) 
		    {
		        k=k+i-1;
		    }
            System.out.println(j);
            i++;
            j++;
		}
        t--; 
		}
	}
}
