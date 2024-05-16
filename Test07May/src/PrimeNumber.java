import java.util.Scanner;
import java.util.SequencedSet;

public class PrimeNumber {

    public static void main(String[] args) {

        int number;
        int count = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number...");
        number = sc.nextInt();

        for (int i=1;i<=number;i++)
        {
            if (number%i==0)
            {
                //for incremnet
                count++;
            }
        }
        if (count==2)
        {
            System.out.println(number+ "is a prime number");
        }
        else
        {
            System.out.println(number+ "is not a prime number");
        }
    }
}
