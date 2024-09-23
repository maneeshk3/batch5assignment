// Write java program to print factorial of a number using recursion function.
import java.util.*;

class Factorial
{
	static int fac(int n)
	{
	
	if(n==0)
	{
		return 1;
	}
	
	
	return n*fac(n-1);
	
	}	
	
	public static void main(String[] args)
	{
		
		Scanner ui = new Scanner(System.in);
		System.out.println("******factorial using recursion******");
		System.out.println("Enter a number");
		int n = ui.nextInt();
		System.out.println(fac(n));
		
		
		
	}
	
}