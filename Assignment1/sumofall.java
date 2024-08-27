/**
 * 
 */
package com.Thogata;


	import java.util.Scanner;

	public class sumofall {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter an integer: ");
	        int number = scanner.nextInt();
	        
	        int sum = 0;
	        while (number != 0) {
	            sum += number % 10; // Add the last digit to sum
	            number /= 10; // Remove the last digit
	        }
	        
	        System.out.println("The sum of the digits is: " + sum);
	        
	        scanner.close();
	    


	}

}
