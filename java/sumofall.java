import java.util.Scanner;  
public class temper   
{  
public static void main(String args[])  
{  
int n, digit, sum = 0;  
Scanner sc = new Scanner(System.in);  
System.out.print("Enter the number: ");  
n = sc.nextInt();  
while(n > 0)  
{  
digit = n % 10;  
sum = sum + digit;    
n = n / 10;  
}  
//prints the result  
System.out.println("Sum of Digits: "+sum);  
}  
}  