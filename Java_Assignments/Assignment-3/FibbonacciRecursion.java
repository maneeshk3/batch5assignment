/*Question 5:
Write a java program to print fibonacci series using recursion fuction.
Make sure you have following in your recursion function
1. Base Case
2. return statement and return type
3. Method should call itself inside the method body.
 */

public class FibbonacciRecursion {
	public static int fibonacci(int n) {
		if(n<=1) {
			return n;
		} else {
			return fibonacci(n-1)+fibonacci(n-2);
			}
	}
	public static void main (String[] args) {
		int n = 10;
		int result = fibonacci(n);
		System.out.println("the " + n + "th Fibonacci number is "+ result);
	}
}
	
