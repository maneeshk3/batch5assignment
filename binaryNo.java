import java.util.*;

public class binaryNo {
	
	public static void main(String[] args) {
		int c=0, r=0,temp;
		System.out.println("Enter a binary number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		temp = n;
		while(n>0)
		{
			if((n % 10 == 0) || (n % 10 == 1))
				c++;
				r++;
				n=n/10;
		}
		if(c==r)
			System.out.println(temp + " is a Binary Number");
		else
			System.out.println(temp + "is a Not Binary Number");
		}

	}

