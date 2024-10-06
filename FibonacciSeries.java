import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();
      
        int num1 = 0, num2 = 1;
        System.out.print("Fibonacci series up to " + n + " terms: ");
        for (int i = 0; i <= n; i++) {
            System.out.print(num1 + " ");
            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }
    }
}
