import java.util.Scanner;

public class FindMin {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number of elements: ");
int n = sc.nextInt();
int[] arr = new int[n];
System.out.println("Enter the elements: ");
for (int i = 0; i < n; i++) {
arr[i] = sc.nextInt();
}
int min = findMin(n, arr);
System.out.println("The minimum element in the array is: " + min);
sc.close();
}

    public static int findMin(int n, int[] arr) {
        // If the array is empty, return Integer.MAX_VALUE as we don't have a minimum yet
        if (n == 0) {
            return Integer.MAX_VALUE;
        }
        int min = arr[0]; // Initialize the minimum to be the first element of the array
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i]; // Update the minimum if we find a smaller element
            }
        }
        return min; // Return the minimum number of the array
    }
}

