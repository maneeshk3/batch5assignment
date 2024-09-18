package javacodeseries;

import java.util.Scanner;

public class PrimeCheck {
	public static void main(String[]args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=scanner.nextInt();
		scanner.close();
		
		boolean isPrime=true;
		
		if(num<=1) {
			isPrime=false;
		}
		else {
			for(int i=2;i<=Math.sqrt(num);i++) {
				if(num%i==0) {
					isPrime=false;
					break;
				}
			}
		}
		if(isPrime) {
			System.out.println(num+"is a prime numer.");
		}
		else {
			System.out.println(num+"is not a prime number.");
		}
	}
}