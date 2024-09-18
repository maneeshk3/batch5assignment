package javacodeseries;

import java.util.Scanner;

public class BinaryCheck {
	public static void main(String[]args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=scanner.nextInt();
		scanner.close();
		
		String numStr=Integer.toString(num);
		boolean isBinary=true;
		
		for(char c:numStr.toCharArray()) {
			if(c!='0'&&c!='1') {
				isBinary=false;
				break;
				
			}
		}
		if(isBinary) {
		System.out.println(num+"is not a binary number.");
		}
		else
		{
			System.out.println(num+"is not a binary number.");
			
		}
		
	}

}
