/*Question 11:
Write a java method, which will take array of integers as input and will reverse 
the elements in the array.
 */

public class ArrayReverse {
    
    public static void reverseArray(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return; // no need to reverse if array is null, empty or has only one element
        }
        
        int start = 0;
        int end = arr.length - 1;
        
        while (start < end) {
            // swaping
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            
            // move towards the center
            start++;
            end--;
        }
    }
    
    // main method for testing
    public static void main(String[] args) {
        int[] testArray = {1, 2, 3, 4, 5};
        
        System.out.println("the given array is ");
        printArray(testArray);
        
        reverseArray(testArray);
        
        System.out.println(" the reversed array is ");
        printArray(testArray);
    }
    
    // this method to print array
    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}