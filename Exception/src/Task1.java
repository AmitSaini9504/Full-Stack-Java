import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        try
        {
            ReadFile("TextFile.txt");
        }
        catch (FileNotFoundException e)
        {
            System.err.println("File Not Found: " +e.getMessage());

        }
        finally {
            System.out.println("Final block execute");
        }
    }
    public static void ReadFile(String filename) throws FileNotFoundException
    {
        File file = new File(filename);

        Scanner sc = new Scanner(file);

        while (sc.hasNextLine())
        {
            System.out.println(sc.nextLine());
        }
        sc.close();
    }
}

