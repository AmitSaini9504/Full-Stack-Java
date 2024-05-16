import java.util.Scanner;

public class ScannerInput {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        //get input
        System.out.print("Enter Age:  ");
        int age = sc.nextInt();


        //taking input for height in double

        System.out.print("Enter your height:  ");
        double height = sc.nextDouble();

        //taking string input

        System.out.print("Enter your name : ");
        sc.nextLine();
        String name = sc.nextLine();

        System.out.println("You are " + age + "years old and " + height + "feet tall");
        System.out.println("Your name is " +name);
    }
}
