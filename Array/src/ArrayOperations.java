import java.util.Scanner;
import java.util.Arrays;

public class ArrayOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // One-dimensional array declaration and initialization
        int[] numbers = new int[5];
        System.out.println("Enter 5 integer numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Multidimensional array declaration (even)
        int[][] evenMatrix = new int[3][4];
        System.out.println("\nEnter elements for a 3x4 matrix:");
        for (int i = 0; i < evenMatrix.length; i++) {
            for (int j = 0; j < evenMatrix[i].length; j++) {
                evenMatrix[i][j] = scanner.nextInt();
            }
        }

        // Jagged array declaration and initialization
        int[][] jaggedArray = new int[3][];
        jaggedArray[0] = new int[2]; // First inner array has 2 elements
        jaggedArray[1] = new int[4]; // Second inner array has 4 elements
        jaggedArray[2] = new int[1]; // Third inner array has 1 element
        System.out.println("\nEnter elements for a jagged array:");
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                jaggedArray[i][j] = scanner.nextInt();
            }
        }

        // Input validation (optional)
        // You can add checks here to ensure valid input within expected ranges

        // Printing arrays
        System.out.println("\nOne-dimensional array:");
        System.out.println(Arrays.toString(numbers));

        System.out.println("\nEven multidimensional array:");
        for (int[] row : evenMatrix) {
            System.out.println(Arrays.toString(row));
        }

        System.out.println("\nJagged array:");
        for (int[] row : jaggedArray) {
            System.out.println(Arrays.toString(row));
        }

        // Searching (demonstrate linear search for simplicity)
        System.out.println("\nEnter a number to search in the one-dimensional array:");
        int searchNumber = scanner.nextInt();
        boolean found = false;
        for (int number : numbers) {
            if (number == searchNumber) {
                found = true;
                break;
            }
        }
        System.out.println(searchNumber + (found ? " is found" : " is not found"));

        // Sorting (demonstrate bubble sort for simplicity)
        System.out.println("\nOne-dimensional array (before sorting):");
        System.out.println(Arrays.toString(numbers));

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        System.out.println("One-dimensional array (after sorting):");
        System.out.println(Arrays.toString(numbers));

        // for-each loop demonstration
        System.out.println("\nIterating over the one-dimensional array using for-each loop:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        scanner.close(); // Good practice to close the Scanner when done
    }
}
