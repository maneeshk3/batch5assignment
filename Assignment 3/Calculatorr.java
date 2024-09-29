public class Calculatorr {

    // Method to calculate HCF (also known as GCD)
    public static int hcf(int... numbers) {
        int result = numbers[0];
        for (int number : numbers) {
            result = gcd(result, number);
        }
        return result;
    }

    // Helper method to calculate GCD of two numbers
    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Method to calculate LCM
    public static int lcm(int... numbers) {
        int result = numbers[0];
        for (int number : numbers) {
            result = (result * number) / hcf(result, number);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {12, 15, 20};

        // Calculate HCF
        int hcfValue = hcf(nums);
        System.out.println("HCF: " + hcfValue);

        // Calculate LCM
        int lcmValue = lcm(nums);
        System.out.println("LCM: " + lcmValue);
    }
}
