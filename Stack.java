class Stack{
    int stack[];
    int top;
    int capacity;
    public Stack(int capacity){
        this.capacity=capacity;
        this.stack=new int[capacity];
        top=-1;
    }
    public void push(int item){
        if (top == capacity - 1) {
            System.out.println("Stack is full.");
        }
        stack[++top] = item;
    }
    public int pop(){
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        }
        return stack[top--];
    }
    public boolean isEmpty() {
        return top == -1;
    }
    public static void main(String[] args) 
    {
        Stack stack=new Stack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Is the stack empty? " + stack.isEmpty());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Is the stack empty? " + stack.isEmpty());
    }
}
