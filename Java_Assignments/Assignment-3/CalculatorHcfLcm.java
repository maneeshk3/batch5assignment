/*Question 12:
Write a final method in Calculator created above to get the LCM, HCF of varargs.
go through the varargs topic in the Chapter 7 to understand what varargs is. */

public class CalculatorHcfLcm {

    public int multiply(int a, int b) {
        return a * b;
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            System.out.println("cannot divide by zero.");
            return 0;
        } else {
            return a / b;
        }
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            System.out.println("cannot divide by zero.");
            return 0;
        } else {
            return a / b;
        }
    }

    // LCM method using varargs
    public static long lcm(long... numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("at least one number is required");
        }
        long lcm = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            lcm = lcm(lcm, numbers[i]);
        }
        return lcm;
    }
    
    // this method help to calculate LCM of two numbers
    private static long lcm(long a, long b) {
        return Math.abs(a * b) / gcd(a, b);
    }
    
    // this is HCF method using varargs
    public static long hcf(long... numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("At least one number is required");
        }
        long result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result = gcd(result, numbers[i]);
        }
        return result;
    }
    
    // this method help to calculate GCD of two numbers using Euclidean algorithm
    private static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }

    public static void main(String[] args) {
        CalculatorHcfLcm calc = new CalculatorHcfLcm();

        // print integer operations
        System.out.println("multiply 2 integers is  " + calc.multiply(5, 3));
        System.out.println("add 2 integers is " + calc.add(10, 2));
        System.out.println("subtract 2 integer is  " + calc.subtract(7, 4));
        System.out.println("divide 2 integer is  " + calc.divide(12, 3));

        // print double datatype operations
        System.out.println("multiply 2 double variables is " + calc.multiply(2.5, 3.0));
        System.out.println("add 2 double variables is " + calc.add(1.5, 4.7));
        System.out.println("subtracting double variables is " + calc.subtract(8.2, 2.1));
        System.out.println("dividing 2 double variables is " + calc.divide(10.5, 2.5));

        
        //  LCM and HCF operations
        System.out.println("LCM of 12, 18, 24: " + CalculatorHcfLcm.lcm(12, 18, 24));
 
		System.out.println("HCF of 48, 18, 60: " + CalculatorHcfLcm.hcf(48, 18, 60));
    }
}