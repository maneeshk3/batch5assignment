public class Fibonacci {

    // Recursive method to calculate Fibonacci number
    public static int fibonacci(int n) {
        // Base case: if n is 0, return 0; if n is 1, return 1
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        // Recursive case: return the sum of the two preceding numbers
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int terms = 10; // Number of terms to print in the Fibonacci series

        System.out.println("Fibonacci Series up to " + terms + " terms:");
        for (int i = 0; i < terms; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
