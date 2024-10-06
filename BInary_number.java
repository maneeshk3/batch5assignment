import java.util.Scanner;

public class BInary_number {
    public static void main(String[] args) {
        // Creating a Scanner sc object to read input from the user
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an number: ");
        int input = sc.nextInt();

        // Now check if the input is a binary number or not via if else statement
        if (isBinary(input)) {
            System.out.println("The number " + input + " is a binary number.");
        } else {
            System.out.println("The number " + input + " is NOT a binary number.");
        }
    }

    // Method 
    public static boolean isBinary(int num) {
        
        if (num == 0) {
            return true;
        }

       
        while (num > 0) {                              // Checking every digits to confirm it is either 0 or 1
            int digit = num % 10;
            if (digit != 0 && digit != 1) {
                return false;
            }
            num /= 10;
        }
        return true;
    }
} 