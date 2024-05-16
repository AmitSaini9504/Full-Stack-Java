import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        int x;
        int y;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Base Value...");
        x =sc.nextInt();

        System.out.print("Enter Exponent Value...");
        y = sc.nextInt();

        int result = power(x, y);
        System.out.println(x + "^" +y +" = " + result);
    }

    public static int power(int x, int y) {
        if (y == 0) {
            return 1;
        } else if (y == 1) {
            return x;
        } else {
            // For exponent greater than 1,  calculating power
            return x * power(x, y - 1);
        }
    }
}
