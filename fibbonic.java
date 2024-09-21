import java.util.*;

public class fibbonic {

	public static void main(String[] args) {
		int n1 = 0, n2 = 1;
		int sum = 0;
		System.out.println("Enter a digit");
		Scanner s =new Scanner(System.in);
		int num = s.nextInt();
		System.out.print(n1 + " " + n2);
		for(int i =2; i < num; i++)
		{
			sum = n1+n2;
			System.out.print(" "+ sum);
			n1 = n2;
			n2 = sum;
		}

	}

}
