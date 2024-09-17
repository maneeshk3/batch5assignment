package javacodeseries;

import java.util.Scanner;

public class Fibonaccii {
	public static void main(String[]args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number of Fibonaccii numbers to print:");
		int n=scanner.nextInt();
		scanner.close();
		
		int a=0;
		int b=1;
		System.out.println("Fibonaccii Series:");
		
		for(int i=0;i<n;i++) {
			System.out.print(a+"");
			int sum=a+b;
			a=b;
			b=sum;
		}
		
		
	}

}
