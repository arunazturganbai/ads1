import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(); // Prompt the user to input a number
        long factorial; // Call the factorial method and store the result in a long variable
        factorial = factorial(n);
        System.out.println(factorial); // Output the result to the console
    }

    // Recursive method that takes an integer as input and returns its factorial as a long
    public static long factorial(int n) {
        if (n == 0) { // Base case: 0! = 1
            return 1;
        } else { // Recursive case: n! = n * (n-1)!
            return n * factorial(n - 1);
        }
    }
}

