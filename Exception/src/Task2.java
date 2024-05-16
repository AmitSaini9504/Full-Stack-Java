import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        try {
            double[] numbers = getInputNumbers();
            double average = calculateAverage(numbers);
            System.out.println("Average: " + average);
        } catch (InputMismatchException e) {
            System.err.println("Invalid input: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.err.println("Division by zero: " + e.getMessage());
        } finally {
            System.out.println("Program execution completed.");
        }
    }

    public static double[] getInputNumbers() throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = scanner.nextInt();
        double[] numbers = new double[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextDouble();
        }
        scanner.close();
        return numbers;
    }

    public static double calculateAverage(double[] numbers) throws ArithmeticException {
        if (numbers.length == 0) {
            throw new ArithmeticException("Cannot calculate average of an empty array");
        }
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        return sum / numbers.length;
    }
}
