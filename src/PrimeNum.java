import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt(); // Prompt the user to input a number
        boolean isPrime = PrimeChecker.isPrime(n); // Call the isPrime method of the PrimeChecker class and pass the number as input
        if (isPrime) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }
}

class PrimeChecker {
    // Method that takes an integer as input and returns true if it is a prime number, and false otherwise
    public static boolean isPrime(int n) {
        if (n <= 1) { // 1 is not a prime number, so return false
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) { // Loop from 2 to the square root of n
            if (n % i == 0) { // If n is divisible by any number between 2 and the square root of n, it is not a prime number
                return false;
            }
        }
        return true; // If the method reaches this point, n is a prime number
    }
}

