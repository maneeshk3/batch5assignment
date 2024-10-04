public class ArrayManipulation {

    // Method to reverse the elements of an integer array
    public void reverseArray(int[] array) {
        int left = 0;
        int right = array.length - 1;
        
        // Swapping elements from both ends of the array
        while (left < right) {
            // Swap array[left] and array[right]
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            
            // Move the pointers
            left++;
            right--;
        }
    }

    // Method to print the array
    public void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayManipulation manipulator = new ArrayManipulation();

        // Test array
        int[] testArray = {1, 2, 3, 4, 5, 6,7,8,9,10};

        // Print original array
        System.out.println("Original Array:");
        manipulator.printArray(testArray);

        // Reverse the array
        manipulator.reverseArray(testArray);

        // Print reversed array
        System.out.println("Reversed Array:");
        manipulator.printArray(testArray);
    }
}
