public class Casting {
    public static void main(String[] args) {
        
        double[] doubleArray = {3.5, 2.8, 1.2, 5.9, 4.1};

        
        int[] intArray = new int[doubleArray.length];

       
        for (int i = 0; i < doubleArray.length; i++) {
            intArray[i] = (int) doubleArray[i]; 
        }

        System.out.print("Int Array: ");
        for (int value : intArray) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}