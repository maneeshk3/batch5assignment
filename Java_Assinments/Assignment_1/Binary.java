//2. Take an int input from the user, and check if the input is a binary number or not.
//Hint, a binary number only has 1 or 0.

import java.util.*;

class Binary{
	
	public static void main(String[]args){
		
		boolean binary= true;
		System.out.println("******program to check if the input is a binary number or not******");
		System.out.println("Enter a number");
// declare class object for user input
		Scanner userip = new Scanner (System.in);
// taking user input
		int n = userip.nextInt();
		int num = n;

			while(num !=0){ 
				
				int m;
//using this expression checking if the last digit of number is greater then 1 or not				
				m= num%10;   
				
				if(m>1){
				
				binary=false;	
				break;
				}
				else{
// if last digit is not greater than 1 then its didvide the number with 10 and remove the last digit and loop continues.					
					num=num/10;	
				}	
			}
		if (binary){
			System.out.println(n + " is binary ");		
		}
		else{
			System.out.println(n + " is not a binary ");	
		}
	}
	
	
}
