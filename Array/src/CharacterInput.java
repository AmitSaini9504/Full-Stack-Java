import java.util.Scanner;

public class CharacterInput {
    public static void main(String[] args) throws Exception {

        while (true) {
            System.out.print("Press any key : ");

            char ch = (char) System.in.read();

            System.out.println("You pressed :" + ch);


            System.out.println("Enter 1 for continue...");

            Scanner sc = new Scanner(System.in);

          int x = sc.nextInt();

            if (x == 1)
            {
                continue;
            }
            else
            {
                break;
            }
        }
    }
}