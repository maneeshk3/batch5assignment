package com.sagar;

	import java.util.Scanner;

	public class NaturalNumber {
	    public static void main(String[] args) {
	       
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a natural number N: ");
	        int n = scanner.nextInt();
	        
	        int sum = (n * (n + 1)) / 2;
	        
	        System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
	        scanner.close();
	    }
	}


