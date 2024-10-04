public class Calculator {
    
    public int add(int a, int b) {
        return a + b;
    }
    public double add(double a, double b) {
        return a + b;
    }
    
    public int subtract(int a, int b) {
        return a - b;
    }
    public double subtract(double a, double b) {
        return a - b;
    }
    
    public int multiply(int a, int b) {
        return a * b;
    }
    public double multiply(double a, double b) {
        return a * b;
    }
    
    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return a / b;
    }
    public double divide(double a, double b) {
        if (b == 0.0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return a / b;
    }
    
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        System.out.println("Integer Operations:");
        System.out.println("Add: " + calc.add(12, 7));
        System.out.println("Subtract: " + calc.subtract(12, 7));
        System.out.println("Multiply: " + calc.multiply(12, 7)); 
        System.out.println("Divide: " + calc.divide(12, 7));

        System.out.println("\nDouble Operations:");
        System.out.println("Add: " + calc.add(12.5, 7.2));
        System.out.println("Subtract: " + calc.subtract(12.5, 7.2));
        System.out.println("Multiply: " + calc.multiply(12.5, 7.2));
        System.out.println("Divide: " + calc.divide(12.5, 7.2));
    }
}

