public class Calculator{
   public int add(int a , int b) {
    return a+b;
   }
   public double add(double a , double b) {
    return a+b;
   }
    public int sub(int a , int b) {
    return a-b;
   }
   public double sub(double a , double b) {
    return a-b;
   }
   public int mul(int a , int b) {
    return a*b;
   }
   public double mul(double a , double b) {
    return a*b;
   }
   public int div(int a,int b)
    {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Division by zero");
        }
    }

    // Method to divide two doubles
    public double div(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Division by zero");
        }
    }
    

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Integer Addition: " + calc.add(10,5 ));
        System.out.println("Double Addition: " + calc.add(6.8, 3.2));

        System.out.println("Integer Subtraction: " + calc.sub(7, 3));
        System.out.println("Double Subtraction: " + calc.sub(6.0, 3.2));

        System.out.println("Integer Multiplication: " + calc.mul(8, 3));
        System.out.println("Double Multiplication: " + calc.mul(7.5, 3.2));

        System.out.println("Integer Division: " + calc.div(8, 5));
        System.out.println("Double Division: " + calc.div(8.5, 5.3));
    }
}

