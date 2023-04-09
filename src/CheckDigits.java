import java.util.Scanner;

public class CheckDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.next();
        boolean allDigits = checkAllDigits(s);
        if (allDigits) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }

    public static boolean checkAllDigits(String s) {
        if (s.length() == 0) { // Base case: empty string is all digits
            return true;
        } else {
            char firstChar = s.charAt(0);
            if (Character.isDigit(firstChar)) { // Recursive case: check if first character is a digit, and call function recursively with rest of string
                return checkAllDigits(s.substring(1));
            } else {
                return false; // Recursive case: first character is not a digit, so string does not consist of all digits
            }
        }
    }
}

