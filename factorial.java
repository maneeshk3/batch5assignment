/*
Write java program to print factorial of a number using recursion function.
*/

public class factorial{
	
	public static int fact(int num){
		if (num==0 || num==1){
			return 1;
		}else{
			return num * fact(num-1);
		}
	}
	
	public static void main(String[] args){
		int n = 10;
		System.out.println(fact(n));
		
	}
}