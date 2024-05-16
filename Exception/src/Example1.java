import java.io.FileNotFoundException;
import java.io.FileReader;

public class Example1 {
    public static void main(String[] args) {

        System.out.println("Inside Main");

        int a = 10;
        try
        {

            FileReader fileReader = new FileReader("testfile.txt");
            int b = 10 /0;

        }
        catch (FileNotFoundException e)
        {
            System.out.println("Inside catch File not found ");
            e.printStackTrace();
        }
       catch (Exception e)
       {
           System.out.println("Airthmaic");
       }

        int k = 45;
        int L = 39;
        System.out.println(k+L);

    }
}
