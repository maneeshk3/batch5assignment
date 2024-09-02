import java.util.Scanner;
public class Binary {    
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter a number to chech binary or not");
        int n = num.nextInt();
        
        boolean isBinary = true;
        int number = n;        
        while (n > 0) {
            int digit = n % 10;
            if (digit != 0 && digit != 1) {
                isBinary = false;
                break;
            }
            n /= 10;
        }        
        if (isBinary) {
            System.out.println(num + " is a binary number.");
        } else {
            System.out.println(num + " is not a binary number.");
        }
        num.close();
    }
}
}
