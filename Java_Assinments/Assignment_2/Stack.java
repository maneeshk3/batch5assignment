// Question 2.0:
// Please refer to the stack topic of the chapter 6 of the java book and implement a stack class
// with the relevant instance variable and methods. Create an object of this class
// and perform push() and pop() methods on this stack object.

import java.util.*;

class Stack 
{
	int stck [] = new int[10];
	int tos;
	
	stack()
	{
		tos = -1;
	}
	void push(int item)
	{
		if(tos==9)
		{
			System.out.println("Stack is full.");
		}
		else
		{
			stck[++tos] = item;
		}
	}
	int pop() 
		{
			if(tos < 0)
			{
			System.out.print("Stack underflow.");
			return 0;
			}
			else
			{
			return stck[tos--];	
			}
		
		}


	public static void main(String[] args)
	{
		stack obj = new stack();
		
		obj.push(10);
		obj.push(20);
		obj.push(30);
		obj.push(40);
		obj.push(50);
		obj.push(60);
		obj.push(70);
		obj.push(80);
		obj.push(90);
		obj.push(100);
		obj.push(110);
		
		
		System.out.println(obj.pop());
		System.out.println(obj.pop());
		System.out.println(obj.pop());
		System.out.println(obj.pop());
		System.out.println(obj.pop());
		System.out.println(obj.pop());
		System.out.println(obj.pop());
		System.out.println(obj.pop());
		System.out.println(obj.pop());
		System.out.println(obj.pop());
		System.out.println(obj.pop());
		
		
		
	}	














} 	



