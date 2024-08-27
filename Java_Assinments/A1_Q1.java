//1. Write a program to print the sum of Nth natural number, take the N as an input from the user.
//Hint, sum of nth natural number formula is (n * (n + 1) / 2), For user input go through Scanner class provided by java.


import java.util.*;

class mak
{

	public static void main(String[]args)
	{
// declare class object for user input

		System.out.println("******program to print the sum of Nth natural number******");
		System.out.println("Enter a number");
		Scanner userip = new Scanner(System.in);
// taking a user input
		int n = userip.nextInt();
		int sum= 0;
//adding the value one by one to nth number using for loop(value starts form 1, loop continues to nth number)
			for (int i=1;i<=n;i++)
			{	
					sum=sum+i;
			}
		System.out.print("sum of "+n);
		System.out.println("th natural number = " +sum);

	}

}
 