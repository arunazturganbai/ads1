import java.util.Scanner;

public class FindAver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object to read input from the user
        System.out.print("Write the number of elements in the array: ");
        int n = input.nextInt(); // Read the number of elements from the user

        int[] array = new int[n]; // Create an integer array of size n
        System.out.println("Write the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt(); // Read the elements of the array from the user
        }

        double average = calculateAverage(array); // Call the calculateAverage method and pass the array as input
        System.out.println(average);
        input.close(); // Close the Scanner object
    }

    public static double calculateAverage(int[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }
}
