import java.util.*;
class fabonacci{
public static void main(String args[])
{
int a=0,b=1,sum=0;
int x;
Scanner S= new Scanner(System.in);
System.out.println("enter a number");
x = S.nextInt();

while(sum <= x)
{
System.out.println(sum);
a = b; 
b = sum;
sum = a + b;  
}
}
}