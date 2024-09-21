import java.util.*;

public class CheckEven {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		if(num%2==0) {
			System.out.println(num + " is a Even Number");
		}
		else {
			System.out.println(num + " is Not a Even Number");
		}
	
	}

}
