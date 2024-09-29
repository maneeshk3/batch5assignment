public class ArrayReversal {

    // Method to reverse the elements in an array
    public static void reverseArray(int[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            // Swap the elements at left and right indices
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            // Move towards the middle
            left++;
            right--;
        }
    }

    // Method to print the array
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println(); // New line for better readability
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println("Original Array:");
        printArray(numbers);

        // Reverse the array
        reverseArray(numbers);

        System.out.println("Reversed Array:");
        printArray(numbers);
    }
}
