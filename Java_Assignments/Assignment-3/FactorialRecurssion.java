/*Question 6:
Write java program to print factorial of a number using recursion function.
 */

public class FactorialRecurssion {
	public static int factorial(int n) {
		if (n==0 || n==1) {
			return 1;
		}else return n*factorial(n-1); //take recursion  
	}
	public static void main(String[] args) {
		int number = 5; //give input 
		int result = factorial(number);
		System.out.println("the Factorial of " + number +" is "+ result);
 }
}
