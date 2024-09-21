import java.util.*;
public class CalculatorWithFinal {
    public int add(int num1, int num2) {
        return num1+num2;
    }
    public int subract(int num1, int num2) {
        return num1-num2;
    }
    public int multiply(int num1, int num2) {
        return num1*num2;
    }
    public int divide(int num1, int num2) {
        return num1/num2;
    }
    public double add(double num1, double num2) {
        return num1+num2;
    }
    public double subract(double num1, double num2) {
        return num1-num2;
    }
    public double multiply(double num1, double num2) {
        return num1*num2;
    }
    public double divide(double num1, double num2) {
        return num1/num2;
    }
    public final int findHCF(int num1, int num2) {
       int hcf=0;

    for (int i = 1; i <= num1 || i <= num2; i++)
      {
        if (num1 % i == 0 && num2 % i == 0)
        hcf = i;
      }
      return hcf;
    }
    public final int findLCM(int num1,int num2){
          return (num1 * num2) / findHCF(num1, num2);
    }
    public static void main(String [] args) {
        CalculatorWithFinal calc = new CalculatorWithFinal();
        System.out.println("Add: " + calc.add(5,6));
        System.out.println("Subtract: " + calc.subract(10,2));
        System.out.println("Multiply: " + calc.multiply(7,15));
        System.out.println("Divide: " + calc.divide(100,5));
        System.out.println("Add: " + calc.add(5.1,6.2));
        System.out.println("Subtract: " + calc.subract(10.25,2.3));
        System.out.println("Multiply: " + calc.multiply(7.25,15.2));
        System.out.println("Divide: " + calc.divide(100.20,5.5));
        System.out.println("findHCF: " + calc.findHCF(15,25));
        System.out.println("findLCM: " + calc.findLCM(15,25));
    }
}
