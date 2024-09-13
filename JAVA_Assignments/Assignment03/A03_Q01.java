/*Write a java program to create a class 'Calculator', that has methods
such as multiply(), add(), subtract(), divide(), accepting two arguments
both of them as int data type. Overload these methods which will be accepting
two arguments of datatype double. In the main method showcase the use of these methods.*/

import java.util.*;
class calculator{
	int multiply(int a, int b){
		int z= a*b;
		return z;
		
	}
	int add(int a, int b){
		
		int z= a+b;
		return z;
		
	}
	int subtract(int a, int b){
		int z= a-b;
		return z;
	}
	int divide(int a, int b){
		int z=a/b;
		return z;
	}
	
	double multiply(double a, double b){
		double z= a*b;
		return z;
		
	}
	double add(double a, double b){
		double z= a+b;
		return z;
		
	}
	double subtract(double a, double b){
		double z= a-b;
		return z;
	}
	public double divide(double a, double b){
		double z= a/b;
		return z;
	}
		
	
	
	
	public static void main(String args[])
	{
		calculator C = new calculator();
		System.out.println("addition = " + C.add(15,2));
		System.out.println("subtract = " + C.subtract(15,2));
		System.out.println("multiplication = " + C.multiply(15,5));
		System.out.println("division = " + C.divide(15,2));
		
		System.out.println("addition = " + C.add(15.8,10.2));
		System.out.println("subtract = " + C.subtract(15.9,1.2));
		System.out.println("multiplication = " + C.multiply(14.8,15.5));
		System.out.println("division = " + C.divide(1.5,1.2));
		
		
		
	}	
}

