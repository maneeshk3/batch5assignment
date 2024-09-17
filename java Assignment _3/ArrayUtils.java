public class ArrayUtils {

    // Method to reverse an integer array
    public static void reverseArray(int[] array) {
        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        
        System.out.println("Original Array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        
        reverseArray(numbers);
        
        System.out.println("\nReversed Array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
