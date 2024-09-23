import java.io.*;
import java.util.*;

class StackClass {
  
      // Main Method
    public static void main(String[] args)
    {

        // Default initialization of Stack
        Stack stack = new Stack();

        // Initialization of Stack
        // using Generics "Alice Smith", 25, "456 Elm Street"
        Stack<String> stack1 = new Stack<String>();
        Stack<String> stack2 = new Stack<String>();
		
		
        // pushing the elements
        stack1.push("Alice");
        stack1.push("56");
        stack1.push("456 Elm Street");
        stack1.pop();
        stack1.push("Shiva");

        stack2.push("nagendra");
        stack2.push("25");
        stack2.push("Andhrapradesh,A.P");

          // Printing the Stack Elements
        System.out.println(stack1);
        System.out.println(stack2);
    }
}