public class Calculator {

    // Method to calculate HCF (GCD) using varargs
    public final int hcf(int... numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("At least one number is required");
        }
        int result = numbers[0];
        for (int number : numbers) {
            result = gcd(result, number);
        }
        return result;
    }

    // Helper method to compute GCD of two numbers
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Method to calculate LCM using varargs
    public final int lcm(int... numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("At least one number is required");
        }
        int result = numbers[0];
        for (int number : numbers) {
            result = lcm(result, number);
        }
        return result;
    }

    // Helper method to compute LCM of two numbers
    private int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        
        // Example usage for HCF
        int hcfResult = calculator.hcf(12, 15, 21);
        System.out.println("HCF: " + hcfResult); // Output: HCF: 3

        // Example usage for LCM
        int lcmResult = calculator.lcm(12, 15, 21);
        System.out.println("LCM: " + lcmResult); // Output: LCM: 60
    }
}
