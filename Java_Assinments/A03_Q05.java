// Question 5:
// Write a java program to print fibonacci series using recursion fuction.
// Make sure you have following in your recursion function
// 1. Base Case
// 2. return statement and return type
// 3. Method should call itself inside the method body


import java.util.*;

class recursion
{
	static int fib(int n1,int x,int y)
	{
	
	
	if (n1==0)
	{
		return n1;
	}
	
		System.out.print(x +  ", ");
		
		
		return fib(n1-1,y,x+y);
		
	}
	
	
	
	
	
	public static void main(String [] args)
	{
		
		Scanner ui = new Scanner(System.in);
		System.out.println("******fibonacci series using recursion******");
		System.out.println("Enter a number");
		int n = ui.nextInt();
		fib(n,0,1);
		
	}
	
}