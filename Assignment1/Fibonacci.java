package assignment1;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of Fibonacci numbers to print: ");
        int n = scanner.nextInt();

        // Initialize the first two Fibonacci numbers
        int a = 0;
        int b = 1;

        System.out.println("The first " + n + " numbers in the Fibonacci series are:");
        
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
