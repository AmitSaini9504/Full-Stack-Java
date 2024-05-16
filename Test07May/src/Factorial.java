import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        int factorial = factorial(number);
        System.out.println("Factorial of " + number + " is: " + factorial);
    }

    public static int factorial(int number) {
//for checking input number
        if (number == 0 || number == 1) {
            return 1;
        } else {

            return number * factorial(number - 1);
        }
    }
}