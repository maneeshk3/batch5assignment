public class Calculator{
    
    public static int multiplication(int a,int b){
        return a*b;
    }
    
    public static double multiplication(double a,double b){
        return a*b;
    }
    
    public static int addition(int a,int b){
        return a+b;
    }
    
    public static double addition(double a,double b){
        return a+b;
    }
    
    public static int subtraction(int a,int b){
        return a-b;
    }
    
    public static double subtraction(double a,double b){
        return a-b;
    }
    
    public static int divide(int a,int b){
        return a/b;
    }
    
    public static double divide(double a,double b){
        return a/b;
    }
    
    public static void main (String[] args){
        
        
        int num1 = multiplication(11,6);
        int num2 = addition(11,6);
        int num3 = subtraction(11,6);
        int num4 = divide(11,6);
        System.out.println("Multiplication : " + num1);
        System.out.println("Addition : " + num2);
        System.out.println("Substraction : " + num3);
        System.out.println("Division : " + num4);
        
       
        double num5 = multiplication(3.3,3.3);
        double num6 = addition(3.3,3.3);
        double num7 = subtraction(3.3,3.3);
        double num8 = divide(3.3,3.3);
        System.out.println("Multiplication : " + num5);
        System.out.println("Addition : " + num6);
        System.out.println("Substraction : " + num7);
        System.out.println("Division : " + num8);
        
        
    }
}
