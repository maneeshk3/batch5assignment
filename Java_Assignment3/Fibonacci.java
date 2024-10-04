public class Fibonacci {
    public static void main(String[] args) {
        int n = 10;
        System.out.println("Fibonacci Series up to " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            System.out.println(fibonacci(i) + " ");
        }
    }

    // Recursive function to calculate Fibonacci numbers
    public static int fibonacci(int n) {
        // Base Case: Fibonacci of 0 and 1 is 0 and 1 respectively
        if (n == 0 || n == 1) {
            return n;
        } else {
            // Recursive Call: Calculate Fibonacci of n-1 and n-2
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
