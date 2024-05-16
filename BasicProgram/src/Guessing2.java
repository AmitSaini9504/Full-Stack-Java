import java.util.Scanner;

public class Guessing2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("User 1 Input : - ");
        int user1 = sc.nextInt();

        final int maxAttempts = 5;

        for (int attempts = 1; attempts <= maxAttempts; attempts++) {
            System.out.print("Attempt " + attempts + ": User 2 input : - ");
            int user2 = sc.nextInt();

            if (user1 == user2) {
                System.out.println("Well done...");
                break;
            } else if (user2 > user1) {
                System.out.println("You are guessing maximum number, try again...");
            } else if (user2 < user1){
                System.out.println("You are guessing minimum number, try again...");
            }
            else {
                System.out.println("Choose valid number...");
            }

            if (attempts == maxAttempts) {
                System.out.println("You've used all your attempts. The correct number was: " + user1);
            }
        }
    }
}
