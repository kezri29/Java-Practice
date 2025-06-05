import java.util.Scanner;

public class FactorialCalculator {

    // Method to compute factorial
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }

        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        if (!scanner.hasNextInt()) {
            System.out.println("❌ Invalid input. Please enter an integer.");
            return;
        }

        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("❌ Factorial is not defined for negative numbers.");
        } else {
            long fact = factorial(number);
            System.out.println("✅ Factorial of " + number + " is: " + fact);
        }

        scanner.close();
    }
}
