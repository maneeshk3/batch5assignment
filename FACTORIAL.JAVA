public class Factorial {

    // Recursive method to calculate factorial
    public static int factorial(int n) {
        // Base case: if n is 0 or 1, return 1
        if (n == 0 || n == 1) {
            return 1;
        }
        // Recursive case: n * factorial(n - 1)
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int number = 5; // Change this value to compute factorial of a different number

        // Calculate factorial
        int result = factorial(number);

        // Print the result
        System.out.println("Factorial of " + number + " is: " + result);
    }
}
