/*Question 1:
Write a java program to create a class 'Calculator', that has methods
such as multiply(), add(), subtract(), divide(), accepting two arguments
both of them as int data type. Overload these methods which will be accepting
two arguments of datatype double. In the main method showcase the use of these methods.
 */

//package plm_Assignment;
/*public class Calculator {
    // take methods as integer datatype
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
            System.out.println("Cannot divide by zero.");
            return 0;
        } else {
            return a / b;
        }
    }

    // take methods as double datatype to override 
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
            System.out.println("Cannot divide by zero.");
            return 0;
        } else {
            return a / b;
        }
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // print operation values by using integer datatype 
        System.out.println("multiplying two integer values is " + calc.multiply(5, 3));
        System.out.println("adding two integer values is " + calc.add(10, 2));
        System.out.println("subtracting two integer values is " + calc.subtract(7, 4));
        System.out.println("dividing two integer values is " + calc.divide(12, 3));

        // print operation values by using double datatype
        System.out.println("multiplying two double values is " + calc.multiply(2.5, 3.0));
        System.out.println("adding double values is " + calc.add(1.5, 4.7));
        System.out.println("subtracting two double values is " + calc.subtract(8.2, 2.1));
        System.out.println("dividing two double values  " + calc.divide(10.5, 2.5));
    }
}

*/





import java.util.Scanner;

public class Calculator {
    //using this method adding two integers
    public int add(int a, int b) {
        return a + b;
    }

    // using this method for adding two doubles
    public double add(double a, double b) {
        return a + b;
    }

    //using this method for subtracting two integers
    public int subtract(int a, int b) {
        return a - b;
    }

    // using this method for subtracting two doubles
    public double subtract(double a, double b) {
        return a - b;
    }

    // using this method for multiplying two integers
    public int multiply(int a, int b) {
        return a * b;
    }

    // using this method for multiplying two doubles
    public double multiply(double a, double b) {
        return a * b;
    }

    // using this method for dividing two integers
    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return a / b;
    }

    // using this method for dividing two doubles
    public double divide(double a, double b) {
        if (b == 0.0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        // Accepting two integer values from the user
        System.out.print("enter first integer value: ");
        int intVal1 = scanner.nextInt();
        System.out.print("enter second integer value: ");
        int intVal2 = scanner.nextInt();

        // Accepting two double values from the user
        System.out.print("enter first double value: ");
        double doubleVal1 = scanner.nextDouble();
        System.out.print("enter second double value: ");
        double doubleVal2 = scanner.nextDouble();

        // Performing integer operations
        System.out.println("\nInteger Operations:");
        System.out.println(intVal1 + " + " + intVal2 + " = " + calculator.add(intVal1, intVal2));
        System.out.println(intVal1 + " - " + intVal2 + " = " + calculator.subtract(intVal1, intVal2));
        System.out.println(intVal1 + " * " + intVal2 + " = " + calculator.multiply(intVal1, intVal2));
        try {
            System.out.println(intVal1 + " / " + intVal2 + " = " + calculator.divide(intVal1, intVal2));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        // Performing double operations
        System.out.println("\nDouble Operations:");
        System.out.println(doubleVal1 + " + " + doubleVal2 + " = " + calculator.add(doubleVal1, doubleVal2));
        System.out.println(doubleVal1 + " - " + doubleVal2 + " = " + calculator.subtract(doubleVal1, doubleVal2));
        System.out.println(doubleVal1 + " * " + doubleVal2 + " = " + calculator.multiply(doubleVal1, doubleVal2));
        try {
            System.out.println(doubleVal1 + " / " + doubleVal2 + " = " + calculator.divide(doubleVal1, doubleVal2));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}   


