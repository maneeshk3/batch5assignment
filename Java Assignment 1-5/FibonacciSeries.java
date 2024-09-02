package com.sagar;
	import java.util.Scanner;
      public class FibonacciSeries {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the number of terms in the Fibonacci series: ");
	        int n = scanner.nextInt();
	        if (n <= 0) {
	            System.out.println("Please enter a positive integer.");
	        } else {
	            System.out.println("Fibonacci series up to " + n + " terms:");
	            printFibonacciSeries(n);
	        }
	        scanner.close();
	    }
	    private static void printFibonacciSeries(int n) {
	        if (n >= 1) {
	            System.out.print("0");
	        }
	        if (n >= 2) {
	            System.out.print(", 1");
	        }
	        int a = 0;
	        int b = 1;

	        for (int i = 3; i <= n; i++) {
	            int next = a + b;
	            System.out.print(", " + next);
	            a = b;
	            b = next;
	        }
	      System.out.println();
	    }

	}
