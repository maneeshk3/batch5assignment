package javacodeseries;

import java.util.Scanner;

public class Factorial {
	public static void main(String[]args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = scanner.nextInt();
		scanner.close();
		long factorial=calculateFactorial(num);
		System.out.println("Factorial of"+num+"is:"+factorial);
	}
	public static long calculateFactorial(int n) {
		if(n==0||n==1) {
			return 1;
		}
		//Recursive case:call itself n-1
		else {
			return n*calculateFactorial(n-1);
		}
	}
}
