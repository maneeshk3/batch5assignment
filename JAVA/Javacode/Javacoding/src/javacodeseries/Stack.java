package javacodeseries;

public class Stack {
	int maxSize;
	int top;
	int[]stackArray;
	
	public Stack(int size) {
		maxSize=size;
		stackArray=new int[maxSize];
		top=-1;
	}
	
	public void push(int value) {
		if(top>=maxSize-1) {
			System.out.println("Stack is full.can't push!");
			return;
		}
		stackArray[++top]=value;
	}
	public int pop() {
		if(top<0) {
			System.out.println("Stack is empty.Can't pop!");
			return-1;
		}
		return stackArray[top--];
	}
	public static void main(String[]args) {
		Stack stack=new Stack(3);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}
}
