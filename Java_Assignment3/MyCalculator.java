class Calculator {

    // ... existing methods ...

    // Method to calculate LCM using varargs
    public final void calculateLCM(int... numbers) {
        int lcm = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            lcm = (lcm * numbers[i]) / calculateHCF(lcm, numbers[i]);
        }
        System.out.println("LCM: " + lcm);
    }

    // Method to calculate HCF using varargs
    public final void calculateHCF(int... numbers) {
        int hcf = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            hcf = calculateHCF(hcf, numbers[i]);
        }
        System.out.println("HCF: " + hcf);
    }

    // Helper method to calculate HCF of two numbers
    private int calculateHCF(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }
        return calculateHCF(num2, num1 % num2);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Calculate LCM
        System.out.println("LCM of 2, 4, 6:");
        calculator.calculateLCM(2, 4, 6);

        // Calculate HCF
        System.out.println("HCF of 12, 18, 24:");
        calculator.calculateHCF(12, 18, 24);
    }
}
