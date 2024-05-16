import java.io.File;
import java.io.IOException;

public class W3 {

    public static void main(String[] args) {
        try{

            //path name for
            File myobj = new File("C:\\Users\\amits\\IdeaProjects\\Grass Revision\\FileSystem\\src\\w3.txt");

            if (myobj.createNewFile())
            {
                System.out.println("File created:"+ myobj.getName());
            }
            else {
                System.out.println("File already exists");
            }
        }

        catch (IOException e)
        {
            System.out.checkError();
        }
    }
}
