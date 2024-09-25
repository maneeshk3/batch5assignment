package assignment1;

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an integer value
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Initialize the sum to 0
        int sum = 0;

        // Use a while loop to calculate the sum of the digits
        while (number != 0) {
            // Get the last digit of the number
            int digit = number % 10;

            // Add the digit to the sum
            sum += digit;

            // Remove the last digit from the number
            number /= 10;
        }

        // Print the sum of the digits
        System.out.println("The sum of the digits is: " + sum);
    }
}
