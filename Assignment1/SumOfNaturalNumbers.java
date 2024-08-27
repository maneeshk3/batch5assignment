
package com.Thogata;



	import java.util.Scanner;

public class SumOfNaturalNumbers {

    // Method to calculate the sum of the first n natural numbers
    public static int sumOfNaturalNumbers(int n) {
        // Formula to calculate the sum
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for input
        System.out.print("Enter a positive integer to calculate the sum of the first n natural numbers: ");
        
        // Read the user input
        int n = scanner.nextInt();
        
        // Close the scanner
        scanner.close();
        
        // Validate the input and calculate the sum
        if (n < 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Calculate the sum using the method
            int sum = sumOfNaturalNumbers(n);
            // Print the result
            System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
        }
    }
}

