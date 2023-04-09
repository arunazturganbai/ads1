import java.util.Scanner;

public class BinomialCoefficient {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();

        int result = calculateBinomialCoefficient(n, k); // Call the recursive method to calculate the binomial coefficient
        System.out.println(result);

        input.close();
    }

    // Recursive method to calculate the binomial coefficient
    public static int calculateBinomialCoefficient(int n, int k) {
        // Base case: if k is 0 or equal to n, the result is 1
        if (k == 0 || k == n) {
            return 1;
        } else {
            // Recursive step: use the formula Cn^k = C(n-1)^(k-1) + C(n-1)^k to calculate the result
            return calculateBinomialCoefficient(n - 1, k - 1) + calculateBinomialCoefficient(n - 1, k);
        }
    }
}
