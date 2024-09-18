package javacodeseries;

import java.util.Scanner;

public class SumOfNthNaturalNumber {
	public static void main(String[]args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a positive integer N:");
		int N= scanner.nextInt();
		scanner.close();
		
		int sum=(N*(N+1))/2;
		System.out.println("Sum of first"+N+"natural numbers:"+sum);
		
	}

}
