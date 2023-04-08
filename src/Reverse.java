import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = input.nextInt(); // Prompt the user to input the size of the array

        int[] arr = new int[n]; // Create a new array of size n
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt(); // Prompt the user to input n elements and store them in the array
        }

        System.out.print("Original array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " "); // Output the original array to the console
        }

        reverse(arr, 0, n - 1); // Call the reverse method to reverse the array

        System.out.print("\nReversed array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " "); // Output the reversed array to the console
        }
    }

    // Recursive method that takes an array of integers arr, and two integer indices left and right, and reverses the elements of the array in place
    public static void reverse(int[] arr, int left, int right) {
        if (left < right) { // Base case: left index is equal to or greater than right index
            // Swap the elements at the left and right indices
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            // Recursively call reverse with the left index incremented and the right index decremented
            reverse(arr, left + 1, right - 1);
        }
    }
}

