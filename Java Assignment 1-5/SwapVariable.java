package com.sagar;
import java.util.Scanner;
public class SwapVariable{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first integer: ");
        int a = scanner.nextInt();
        System.out.print("Enter the second integer: ");
        int b = scanner.nextInt();
        System.out.println("Original values: a = " + a + ", b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping with temp variable: a = " + a + ", b = " + b);
        System.out.print("Enter the first integer again: ");
        a = scanner.nextInt();
        System.out.print("Enter the second integer again: ");
        b = scanner.nextInt();
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping without temp variable: a = " + a + ", b = " + b);
        scanner.close();
    }
}
