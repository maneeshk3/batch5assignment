import java.util.Scanner;

public class binary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        String input = scanner.nextLine();
        
        boolean isBinary = input.matches("[01]+"); // Regular expression to check if input contains only 0 and 1
        
        if (isBinary) {
            System.out.println(input + " is a binary number.");
        } else {
            System.out.println(input + " is not a binary number.");
        }
        
        scanner.close();
    }
}
