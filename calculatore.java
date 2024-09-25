class Calculator {
    
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to subtract two integers
    public int subtract(int a, int b) {
        return a - b;
    }

    // Method to multiply two integers
    public int multiply(int a, int b) {
        return a * b;
    }

    // Method to divide two integers
    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return (double) a / b;
    }

    // Overloaded method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    // Overloaded method to subtract two doubles
    public double subtract(double a, double b) {
        return a - b;
    }

    // Overloaded method to multiply two doubles
    public double multiply(double a, double b) {
        return a * b;
    }

    // Overloaded method to divide two doubles
    public double divide(double a, double b) {
        if (b == 0.0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Demonstrate int methods
        System.out.println("Integer Operations:");
        System.out.println("Add: " + calculator.add(10, 5));
        System.out.println("Subtract: " + calculator.subtract(10, 5));
        System.out.println("Multiply: " + calculator.multiply(10, 5));
        System.out.println("Divide: " + calculator.divide(10, 5));

        // Demonstrate double methods
        System.out.println("\nDouble Operations:");
        System.out.println("Add: " + calculator.add(10.5, 5.5));
        System.out.println("Subtract: " + calculator.subtract(10.5, 5.5));
        System.out.println("Multiply: " + calculator.multiply(10.5, 5.5));
        System.out.println("Divide: " + calculator.divide(10.5, 5.5));
    }
}
