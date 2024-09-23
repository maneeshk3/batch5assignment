import java.util.*;
public class Stack
{
    int[] stackArray;
    int top;
    int maxSize;
    public Stack(int size)
    {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }
    public void push(int value)
    {
        if(top < maxSize - 1)
        {
            stackArray[++top] = value;
            System.out.println("Pushed " + value + "onto the stack.");
        }
        else
        {
            System.out.println("Stack overflow! Cannot push " + value);
        }
    }
    public int pop()
    {
        if(top >= 0)
        {
            int value = stackArray[top--];
            System.out.println("Popped " + value + " from the stack.");
        }
        else
        {
            System.out.println("Stack underflow! Cannot pop from an empty stack.");
            //return -1;
        }
        return -1;
    }
    public boolean isEmpty()
    {
        return top == -1;
    }
    public void displayStack()
    {
        if(top >= 0)
        {
            System.out.println("Stack contents:");
            for(int i=0; i<=top;i++)
            {
                System.out.println(stackArray[i]);
            }
        }
        else
        {
            System.out.println("The stack is empty.");
        }
    }
    public static void main(String args[])
    {
        Stack stack = new Stack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.displayStack();
        stack.pop();
        stack.pop();
        stack.displayStack();
        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.push(70);
        stack.displayStack();
        stack.pop();
        stack.pop();
        stack.displayStack();
    }
}