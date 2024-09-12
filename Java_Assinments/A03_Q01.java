// Question 1:
// Write a java program to create a class 'Calculator', that has methods
// such as multiply(), add(), subtract(), divide(), accepting two arguments
// both of them as int data type. Overload these methods which will be accepting
// two arguments of datatype double. In the main method showcase the use of these methods.


import java.util.*;

class calculator
{
	public int multiply(int x, int y)
	{
		 int z = x*y	;
		 return z;
	}
	public int add(int x, int y)
	{
		 int z = x+y;
		 return z;
	}
	public int subtract(int x, int y)
	{
		 int z = x-y;
		 return z;
	}
	public int divide(int x, int y)
	{
		int z = x/y;
		return z;
	}
	public double multiply(double x, double y)
	{
		double z = x*y;
		return z;
	}
	public double add(double x, double y)
	{
		double z = x+y;
		return z;
	}
	public double subtract(double x, double y)
	{
		double z = x-y;
		return z;
	}
	public double divide(double x, double y)
	{
		double z = x/y;
		return z;
	}
	
	public static void main(String[] args)
	{
		int a=40,b=20;
		double c = 6.5 ,d = 4.5;
		
		calculator obj = new calculator();
		
		System.out.println(obj.add(a,b));
		System.out.println(obj.subtract(a,b));
		System.out.println(obj.multiply(a,b));
		System.out.println(obj.divide(a,b));
		
		System.out.println(obj.add(c,d));
		System.out.println(obj.subtract(c,d));
		System.out.println(obj.multiply(c,d));
		System.out.println(obj.divide(c,d));
		

			
	}
	
	
}