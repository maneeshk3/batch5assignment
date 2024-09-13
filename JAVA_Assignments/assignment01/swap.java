import java.util.*;
class swap
{
public static void main(String args[])
{
int x,y;
Scanner S= new Scanner(System.in);
System.out.print("enter two values");
x=S.nextInt();
y=S.nextInt();
x=x+y;
y=x-y;
x=x-y;
System.out.print("x="+x+"y="+y);
}
}