import java.util.Scanner;
public class DigitNumber {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of digits: ");
        int numDigits = scanner.nextInt();
        if (numDigits < 1) {
            System.out.println("Number of digits must be at least 1.");
            scanner.close();
            return;
        }
        int lowerBound = (int) Math.pow(10, numDigits - 1);
        int upperBound = (int) Math.pow(10, numDigits) - 1;
        long sum = 0;
        for (int i = lowerBound; i <= upperBound; i++) {
            sum += i;
        }
        System.out.println("The sum of all " + numDigits + "-digit numbers is: " + sum);
        scanner.close();
	}

}
