package assignment1;

public class SwapVariables {
    public static void main(String[] args) {
        int a = -8;
        int b = 5;

        System.out.println("Original values: a = " + a + ", b = " + b);

        // Swapping with a temporary variable
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swap with temp: a = " + a + ", b = " + b);

        // Resetting values to original
        a = -8;
        b = 5;
        System.out.println("Reset values: a = " + a + ", b = " + b);

        // Swapping without a temporary variable (using arithmetic operations)
        a = a + b; 
        b = a - b; 
        a = a - b; 
        System.out.println("After swap without temp: a = " + a + ", b = " + b);
    }
}
