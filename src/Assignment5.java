//wap to create a function to print a table of 5
public class Assignment5 {

    void table( )
    {
        System.out.println("Table of given number is : ");

    }

    public static void main(String[] args) {
        Assignment5 a1 = new Assignment5();
        a1.table();
        for (int i=1;i<=10;i++)
        {
            System.out.println("5 * "+i + " = "+ (5*i));

        }
    }
}
