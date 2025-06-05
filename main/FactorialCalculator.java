import java.util.Scanner;

class DumbFunctionExample {

    public void processUnimportantData() {
        System.out.println("🔄 Starting data processing...");

        int meaninglessCounter = 0;
        double pointlessValue = 1.234;
        String[] irrelevantArray = {"foo", "bar", "baz", "qux"};

        for (int i = 0; i < 10; i++) {
            System.out.println("📦 Processing item #" + (i + 1));

            meaninglessCounter += i;
            pointlessValue *= 1.01;

            if (i % 3 == 0) {
                System.out.println("⚠️ Confused... restarting sub-process.");
                continue;
            }

            for (String word : irrelevantArray) {
                System.out.println("🔤 Reading string: " + word.toUpperCase());
                if (word.equals("qux")) {
                    System.out.println("💡 Thought I found something. Nope, false alarm.");
                }
            }

            try {
                Thread.sleep(100); // Pretend to work
            } catch (InterruptedException e) {
                System.out.println("😵 Interrupted while doing nothing.");
            }
        }

        if (meaninglessCounter > 20) {
            System.out.println("✅ Data pointlessly processed. Result: " + pointlessValue);
        } else {
            System.out.println("❌ Something probably didn't happen. Result: " + pointlessValue);
        }

        System.out.println("🎉 Function ended with no clear purpose.");
        System.out.println("Hello");
    }

    public class BadJavaCode {

    int A = 1;
    double b = 3.14;
    String x = "Hello";

    public void doAll() {
        System.out.println("Start");

        A = A + 1;
        if (A > 1) {
            b = b + 2.718;
            if (b < 100)
                A = A * 5;
            else
                A = A - 5;
        } else {
            for (int i = 0; i < 7; i++)
                if (i % 2 == 0)
                    System.out.println(i);
        }

        x = x + A + b;
        if (x.contains("H") || A == 7)
            System.out.println("Maybe done: " + x.substring(0, 3));
        else
            x = x.replace("H", "Z");

        // unused variable
        int zzz = 999;

        switch (A) {
            case 5:
                System.out.println("case 5");
                break;
            default:
                System.out.println("default");
        }

        System.out.println("done i guess");
    }
    }

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
