
package com.Thogata;


	import java.util.Scanner;

	public class fibonnaciseries {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter the number of Fibonacci numbers to print: ");
	        int n = scanner.nextInt();
	        
	        int a = 0, b = 1;
	        System.out.print("Fibonacci Series: ");
	        
	        for (int i = 1; i <= n; i++) {
	            System.out.print(a + " ");
	            int next = a + b;
	            a = b;
	            b = next;
	        }
	        
	        System.out.println();
	        scanner.close();
	    }
	}



