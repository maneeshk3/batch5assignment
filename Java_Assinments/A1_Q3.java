//3. Write a program to find if a given number is even or odd.
//Hint, a number is even if it's divisible by 2.
import java.util.*;
class mak3
{
	
	public static void main(String[] args)
	{
		System.out.println("******program to find if a given number is even or odd******");
		System.out.println("Enter a number");
		Scanner userip = new Scanner (System.in);
		int n = userip.nextInt();
			
		if (n%2==0)
		{
			System.out.println(n+" is even number");			
		}	
		else 
		{
			System.out.println(n+" is odd number");
		}
					
	}
	
}