public class MaxMin {
    public static void main(String[] args) {
        int[] arr = {100, 89, 67, 56, 48, 39, 26, 19, 2};

        int[] result = findMaxMin(arr);
        System.out.println("Maximum Value: " + result[0]);
        System.out.println("Minimum Value: " + result[1]);
    }

    public static int[] findMaxMin(int[] arr) {
        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return new int[]{max, min};
    }
}