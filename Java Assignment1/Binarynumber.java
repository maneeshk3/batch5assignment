import java.util.Scanner;
public class Binarynumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        String input = scanner.nextLine();
        if (isBinarynumber(input)) {
            System.out.println("The number is a binary number.");
        } else {
            System.out.println("The number is not a binary number.");
        }
        scanner.close();
    }

private static boolean isBinarynumber(String str) {
    if (str.isEmpty()) {
        return false;
    }
    for (char c : str.toCharArray()) {
        if (c != '0' && c != '1') {
            return false;
        }
    }
    return true;

	}

}
