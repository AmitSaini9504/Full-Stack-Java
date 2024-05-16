import java.util.Scanner;

public class Guessing {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("User 1 Input : - ");
        int user1 = sc.nextInt();
//25

        int attempt = 0;
        final int maxAttempts = 5;
        while (attempt < maxAttempts) {


            System.out.print("User 2 input : - ");
            int user2 = sc.nextInt();

            if (user1 == user2) {
                System.out.println("Well done...");
                break;

            } else if (user2 > user1) {
                System.out.println("You are guessing maximum number try again....");



            }

             else if (user2 < user1) {
                System.out.println("You are guessing minimum number try again ");
            }

             attempt++;

            if (attempt == maxAttempts)
            {
                System.out.println("You are used all your attempts. Correct number was : " +user1);
            }


        }
    }
}