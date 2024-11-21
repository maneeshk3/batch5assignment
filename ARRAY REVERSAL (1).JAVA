public class ArrayReversal {

    // Method to reverse the elements of an integer array
    public static void reverseArray(int[] array) {
        int left = 0; // Starting index
        int right = array.length - 1; // Ending index

        while (left < right) {
            // Swap the elements
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            // Move towards the middle
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        // Example array
        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println("Original Array:");
        printArray(numbers);

        // Reverse the array
        reverseArray(numbers);

        System.out.println("Reversed Array:");
        printArray(numbers);
    }

    // Method to print the elements of the array
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
