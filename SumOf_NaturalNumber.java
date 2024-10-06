import java.util.Scanner;
public class SumOf_NaturalNumber {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a value for N: ");
        int n = sc.nextInt();

        // Calculate the sum of the first N natural numbers using the formula
        int sum = n * (n + 1) / 2;

        System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
    }
}