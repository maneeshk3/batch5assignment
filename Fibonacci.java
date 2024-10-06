public class Fibonacci {

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;       //will return n if it is 0 or 1
        }
        
        return fibonacci(n - 1) + fibonacci(n - 2);  // Recursive case: return the sum of the two preceding numbers
    }

    public static void main(String[] args) {
        int num = 10; 

        System.out.println("Fibonacci Series of given number" + " num:");
        for (int i = 0; i < num; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
