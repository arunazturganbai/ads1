import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Write the base: ");
        int a = input.nextInt(); // Prompt the user to input the base
        System.out.print("Write the exponent: ");
        int n = input.nextInt(); // Prompt the user to input the exponent
        int result = power(a, n); // Call the power method and store the result in an int variable
        System.out.println(result); // Output the result to the console
    }

    // Recursive method that takes an integer a as the base and an integer n as the exponent, and returns a^n as an int
    public static int power(int a, int n) {
        if (n == 0) { // Base case: a^0 = 1
            return 1;
        } else { // Recursive case: a^n = a * a^(n-1)
            return a * power(a, n - 1);
        }
    }
}
