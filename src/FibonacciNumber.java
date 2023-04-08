import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt(); // Prompt the user to input a number
        int fibonacci = fibonacci(n); // Call the fibonacci method and store the result in an int variable
        System.out.println(fibonacci); // Output the result to the console
    }

    // Recursive method that takes an integer n as input and returns the n-th element in the Fibonacci sequence as an int
    public static int fibonacci(int n) {
        if (n == 0) { // Base case: F0 = 0
            return 0;
        } else if (n == 1) { // Base case: F1 = 1
            return 1;
        } else { // Recursive case: Fn = Fn-1 + Fn-2
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
