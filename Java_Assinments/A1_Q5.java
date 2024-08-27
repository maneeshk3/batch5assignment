// 5. Write a program to find the sum of all the numbers of a given digit.

import java.util.*;

class mak5
{
	public static void main(String[] args)
	{
		System.out.println("******program to find the sum of all the numbers of a given digit******");
		System.out.println("Enter a number");
		Scanner userip = new Scanner(System.in);
		int n=userip.nextInt();
		int num=n;
		int sum=0,rem;
		
		while(num>0)
		{
			rem= num%10; //extracte last digit 
			sum= sum+rem; // adds the extracted digit
			num= num/10; //updates number by removing the last digit 	
		}
		
		System.out.println("sum of digit of "+n+" are "+sum);
		
	}
	
	
	
}