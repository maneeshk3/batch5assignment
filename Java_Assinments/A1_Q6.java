// 6. Write a program to print n numbers of fibonacci series, n is the user input.

import java.util.*;

class mak6
{
	
	public static void main(String[] args)
	{
		System.out.println("******fibonacci series******");
		System.out.println("Enter a number");
		Scanner userip = new Scanner(System.in);
		int n = userip.nextInt();
		
		int n1 = 0, n2 = 1,sum;

			for(int i=1;i<=n;i++)
			{
				System.out.print(n1 +  ", ");
				// calculates the next Fibonacci number by adding the previous two numbers
				sum = n1 + n2;
				// after calculating updating next two numbers 
				n1 = n2; 
				n2 = sum;

			}
			
	}
	
	
}
