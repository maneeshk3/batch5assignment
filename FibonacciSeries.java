/*
Write a java program to print fibonacci series using recursion fuction.
Make sure you have following in your recursion function
1. Base Case
2. return statement and return type
3. Method should call itself inside the method body.
*/

public class FibonacciSeries{
	
	public static int fibonacci(int num){
		if (num == 0) {
            return 0;
        } else if (num == 1) {
            return 1;
        } else {
            return fibonacci(num - 1) + fibonacci(num - 2);
        }
	}
	
	public static void main(String[] args){
		
		int n1 = 10;
		for(int i=0;i<=n1;i++){
			System.out.println(fibonacci(i));
		}
	}
}