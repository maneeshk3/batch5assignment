package assignment1;

import java.util.Scanner;

public class BinaryCheck {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int input = scanner.nextInt();

        // Check if the input is a binary number
        if (isBinary(input)) {
            System.out.println("The number " + input + " is a binary number.");
        } else {
            System.out.println("The number " + input + " is NOT a binary number.");
        }
    }

    // Method to check if an integer is a binary number
    public static boolean isBinary(int num) {
        // Edge case: if the number is 0, it is considered binary
        if (num == 0) {
            return true;
        }

        // Check each digit to ensure it is either 0 or 1
        while (num > 0) {
            int digit = num % 10;
            if (digit != 0 && digit != 1) {
                return false;
            }
            num /= 10;
        }
        return true;
    }
}
