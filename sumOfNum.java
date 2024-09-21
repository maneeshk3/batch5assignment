import java.util.*;

public class sumOfNum {
	public static void main(String[] args) {
		int sum =0;
		System.out.println("Enter a digit");
		Scanner s =new Scanner(System.in);
		int num = s.nextInt();
		while(num !=0) {
			sum += (num % 10);
			num = num/10;
		}
		System.out.println("Sum of digits = " + sum);  
	}

}
