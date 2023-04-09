import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        int result = findGCD(a, b);
        System.out.println(result);

        input.close();
    }

    // Function to find the GCD of two numbers using the Euclidean algorithm recursively
    public static int findGCD(int a, int b) {
        if (b == 0) { // base case: if b is 0, return a
            return a;
        } else { // recursive case: call the function recursively with b and the remainder of a divided by b
            return findGCD(b, a % b);
        }
    }
}
