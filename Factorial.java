import java.util.Scanner;

public class Factorial {
    // Recursive method to calculate factorial
    public static int factorial(int n) {
        if (n == 0) {
            return 1;  // Base case: 0! is 1
        }
        return n * factorial(n - 1);  // Recursive case
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Get the number from the user
        System.out.print("Enter a number to calculate its factorial: ");
        int number = scanner.nextInt();

        // Calculate factorial
        int result = factorial(number);

        // Output: Display the result
        System.out.println("Factorial of " + number + " is: " + result);

        scanner.close();
    }
}
