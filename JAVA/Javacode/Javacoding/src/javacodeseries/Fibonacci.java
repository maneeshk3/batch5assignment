package javacodeseries;

public class Fibonacci {
	public static void main(String[]args) {
		int n=10;//number of terms to print
		System.out.println("Fibonacci Series:");
		printFibonacci(n);
	}
	
	public static int printFibonacci(int n) {
		//Base Case:if n is 0 or 1,return n
		if(n==0||n==1) {
			return n;
		}
		//Recursive Case:call itself with n-1 and n-2
		else {
			return printFibonacci(n-1)+printFibonacci(n-2);
		}
	}
}