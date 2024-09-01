public class StackImplementation{
    
    int[] arr=new int[10];
    int index=-1;
    
    
    public void push(int data){
        if(index>=9){
            System.out.println("the stack is full .. no more elements can be added for the particular array as it has reached the arr.length position of the array :"+data);
        } else {
            arr[++index] = data;
            System.out.println("in index: " +index+ " it is printing the array value of push");
            System.out.println("Pushed " + data + " to the stack");
        }
    }   
    
    public int pop(){
        if(index<=-1){
          System.out.println("Stack is empty. Cannot pop");
          return -1; // Indicate stack is empty
        } else {
            int data = arr[index--];
            System.out.println("Popped " + data + " from the stack");
            return data;
        }    
    }
}



