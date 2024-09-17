package javacodeseries;

public class Calculator {

	public int multiply(int a,int b) {
		return a*b;
	}
	public int add(int a,int b) {
		return a+b;
	}
	public int subtract(int a,int b) {
		return a-b;
	}
	public int divide(int a, int b) {
		if(b==0) {
			throw new ArithmeticException("Cannot divide by zero!");
		}
		return a/b;
	}
	public double multiply(double a,double b) {
		return a*b;
	}
	public double add(double a,double b) {
		return a+b;
	}
	public double subtract(double a ,double b) {
		return a-b;
	}
	public double divide(double a ,double b) {
		if(b==0) {
			throw new ArithmeticException("Cannot divide by zero!");
		}
		return a/b;
	}
	public static void main(String[]args) {
		Calculator calculator = new Calculator();
		System.out.println("Multiply (int):"+calculator.multiply(2, 3));
		System.out.println("Add(int):"+calculator.add(2,3 ));
		System.out.println("Subtract(int):"+calculator.subtract(2,3));
		System.out.println("Divide(int):"+calculator.divide(6, 3));
		System.out.println("Multiply(double):"+calculator.multiply(2.5,3.7 ));
		System.out.println("Add(double):"+calculator.add(2.5, 3.7));
		System.out.println("Subtract(double):"+calculator.subtract(2.5, 3.7));
		System.out.println("Divide(double):"+calculator.divide(6.5, 2.5));
	}
}
