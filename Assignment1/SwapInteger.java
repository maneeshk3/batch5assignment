package com.Thogata;


	import java.util.Scanner;

	public class SwapInteger {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter first integer: ");
	        int a = scanner.nextInt();
	        System.out.print("Enter second integer: ");
	        int b = scanner.nextInt();
	        
	        // Swap with a temp variable
	        int temp = a;
	        a = b;
	        b = temp;
	        System.out.println("After swapping (with temp variable): a = " + a + ", b = " + b);
	        
	        // Swap without a temp variable
	        a = a + b;
	        b = a - b;
	        a = a - b;
	        System.out.println("After swapping (without temp variable): a = " + a + ", b = " + b);
	        
	        scanner.close();
	    }
	}


