class Calculator {
    
    public int add(int a, int b) {
        return a + b;
    }


    public int subtract(int a, int b) {
        return a - b;
    }

    
    public int multiply(int a, int b) {
        return a * b;
    }

   
    public double division(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return (double) a / b; // Cast to double for accurate division result
    }

    
    public double add(double a, double b) {
        return a + b;
    }

    
    public double subtract(double a, double b) {
        return a - b;
    }


    public double multiply(double a, double b) {
        return a * b;
    }

   
    public double division(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b; 
    }
}

class CalC {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

      
        int intA = 20;
        int intB = 10;
       
        System.out.println("Addition: " + calculator.add(intA, intB));
        System.out.println("Subtraction: " + calculator.subtract(intA, intB));
        System.out.println("Multiplication: " + calculator.multiply(intA, intB));
        System.out.println("Division: " + calculator.division(intA, intB));
		
		System.out.println("--------------------------------------------------");
        
        double doubleA = 20.5;
        double doubleB = 10.5;
        
        System.out.println("Addition: " + calculator.add(doubleA, doubleB));
        System.out.println("Subtraction: " + calculator.subtract(doubleA, doubleB));
        System.out.println("Multiplication: " + calculator.multiply(doubleA, doubleB));
        System.out.println("Division: " + calculator.division(doubleA, doubleB));
    }
}
