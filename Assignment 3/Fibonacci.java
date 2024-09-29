public class Fibonacci {

    // Recursive method to calculate Fibonacci number
    public static int fibonacci(int n) {
        // Base case: return n if it's 0 or 1
        if (n <= 1) {
            return n;
        }
        // Recursive case: return the sum of the two preceding numbers
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int terms = 10; // Number of terms in the Fibonacci series

        System.out.println("Fibonacci Series up to " + terms + " terms:");
        for (int i = 0; i < terms; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
