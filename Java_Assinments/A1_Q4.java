//4. Write a program to swap int variable values with and without a temp variable.

import java.util.*;

class mak4
{
	mak4()
	{
		System.out.println("******program to swap int variable values with and without a temp variable.******");
	}
	
	static void withtemp(int x,int y){
		
			System.out.println("Before");
			System.out.println("x = "+x);
			System.out.println("y = "+y);	
		int temp= x;
		x=y;
		y=temp;
			System.out.println("After");
			System.out.println("x = "+x);
			System.out.println("y = "+y);
		
	}
	static void withouttemp(int x,int y){
			
			System.out.println("Before");
			System.out.println("x = "+x);
			System.out.println("y = "+y);
		x=x+y;
		y=x-y;
		x=x-y;	
			System.out.println("After");
			System.out.println("x = "+x);
			System.out.println("y = "+y);
		
	}
		public static void main(String[] args)
		{
		mak4 obj = new mak4();
		withtemp(10,15);
		withouttemp(20,30);	
			
		}
	

}