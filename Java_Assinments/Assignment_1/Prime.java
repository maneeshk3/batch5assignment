// 7. Write a program to check if the given number is a prime number or not.
// Hint: a number is prime if it is only divisible by itself.

import java.util.*;

class Prime
{
	public static void main(String[] args)
	{
		
		System.out.println("******program to check if the given number is a prime number or not.******");
		System.out.println("Enter a number");
		Scanner userip= new Scanner(System.in);
		int n= userip.nextInt();
		int count=0;
		
		for(int i=1;i<=n;i++)
		{
// A number is a prime number if it is divisible only by 1 and itself(i.e count==2)
			if(n%i==0) //checking the number is divisible or not and counting it.
			{
			count++;
			}
		}
		if (count==2)
		{
			System.out.println(n+" is prime number");	
		}
		else
		{
			System.out.println(n+" is not prime number");
		}
	}
}
