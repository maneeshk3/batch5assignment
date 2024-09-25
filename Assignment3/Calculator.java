public class Calculator{
    
    public static int multiply(int a,int b){
        return a*b;
    }
    
    public static double multiply(double a,double b){
        return a*b;
    }
    
    public static int add(int a,int b){
        return a+b;
    }
    
    public static double add(double a,double b){
        return a+b;
    }
    
    public static int subtract(int a,int b){
        return a-b;
    }
    
    public static double subtract(double a,double b){
        return a-b;
    }
    
    public static int divide(int a,int b){
        return a/b;
    }
    
    public static double divide(double a,double b){
        return a/b;
    }
    
    public static void main (String[] args){
        
        //int as the data type
        int num1 = multiply(10,5);
        int num2 = add(10,5);
        int num3 = subtract(10,5);
        int num4 = divide(10,5);
        System.out.println("Multiplication of 2 numbers is : " + num1);
        System.out.println("Addition of 2 numbers is : " + num2);
        System.out.println("Substraction of 2 numbers is : " + num3);
        System.out.println("Division of 2 numbers is : " + num4);
        
        //double as datatype
        double num5 = multiply(10.5,5.5);
        double num6 = add(10.5,5.5);
        double num7 = subtract(10.5,5.5);
        double num8 = divide(10.5,5.5);
        System.out.println("Multiplication of 2 numbers is : " + num5);
        System.out.println("Addition of 2 numbers is : " + num6);
        System.out.println("Substraction of 2 numbers is : " + num7);
        System.out.println("Division of 2 numbers is : " + num8);
        
        
    }
}
