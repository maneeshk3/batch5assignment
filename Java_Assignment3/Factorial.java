public class Factorial {
    public static void main(String[] args) {
        int num = 6; // Number to calculate factorial
        int result = factorial(num);
        System.out.println("Factorial of " + num + " = " + result);
    }

    // Recursive function to calculate factorial
    public static int factorial(int n) {
        // Base Case: Factorial of 0 is 1
        if (n == 0) {
            return 1;
        } else {
            // Recursive Call: Calculate factorial of n-1 and multiply by n
            return n * factorial(n - 1);
        }
    }
}
