public class Stack {
    private int[] stack;
    private int top;
    private static final int DEFAULT_CAPACITY = 10;

    // Constructor to initialize the stack with default capacity
    public Stack() {
        stack = new int[DEFAULT_CAPACITY];
        top = -1;
    }

    // Constructor to initialize the stack with a specified capacity
    public Stack(int capacity) {
        stack = new int[capacity];
        top = -1;
    }

    // Method to add an item to the stack
    public void push(int item) {
        if (top == stack.length - 1) {
            // Resize the stack if it is full
            resize();
        }
        stack[++top] = item;
    }

    // Method to remove and return the item at the top of the stack
    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack[top--];
    }

    // Method to return the item at the top of the stack without removing it
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack[top];
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Method to get the number of elements in the stack
    public int size() {
        return top + 1;
    }

    // Method to resize the stack when it is full
    private void resize() {
        int newSize = stack.length * 2;
        int[] newStack = new int[newSize];
        System.arraycopy(stack, 0, newStack, 0, stack.length);
        stack = newStack;
    }

    // Main method to test the stack
    public static void main(String[] args) {
        Stack stack = new Stack(); // Create a stack object

        // Push operations
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top item after pushes: " + stack.peek());

        // Pop operations
        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());

        // Check the size of the stack
        System.out.println("Stack size: " + stack.size());

        // Check if stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());

        // Attempt to pop from an empty stack (this will throw an exception)
        // System.out.println("Popped: " + stack.pop());
    }
}
