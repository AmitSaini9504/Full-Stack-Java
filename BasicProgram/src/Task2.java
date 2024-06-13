import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Input how many values you want : ");

        int value = sc.nextInt();

        int values[] = new int[value];

        System.out.print("Enter " + value + " Values :");
        for (int i=0;i<value;i++)
        {
         values[i] = sc.nextInt();
        }

        for (int i=0;i<value;i++){
          //  System.out.print(values[i]);

            int newValue = (values[i]  + 1);

            System.out.println(newValue + " ");
        }

    }
}