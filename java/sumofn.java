import java.util.Scanner;
	public class sumofn {
		public static void main(String[]args){
			Scanner sc = new Scanner(System.in);
			System.out.println("enter a number");
			int N = sc.nextInt();
			int sum=N*(N+1)/2;
			System.out.println("The sum of the first " + N + " natural numbers is: " + sum);
        
		}
	}
	