public class CalculatorwithLCMandHCF {

    // Method to calculate LCM
    public static int lcm(int... numbers) {
        int lcm = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            lcm = lcm(lcm, numbers[i]);
        }
        return lcm;
    }

    // Method to calculate HCF
    public static int hcf(int... numbers) {
        int hcf = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            hcf = hcf(hcf, numbers[i]);
        }
        return hcf;
    }

    private static int lcm(int a, int b) {
        return a * b / hcf(a, b);
    }

    private static int hcf(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println("LCM of 4, 5, and 6: " + lcm(4, 5, 6));
        System.out.println("HCF of 4, 5, and 6: " + hcf(4, 5, 6));
    }
}
