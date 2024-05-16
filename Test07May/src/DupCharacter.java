import java.util.Map;
import java.util.Scanner;


//Using Ascii value
public class DupCharacter {
    public static void main(String[] args) {

        String inputString;

        Scanner sc = new Scanner(System.in);

        inputString = sc.nextLine();


        //converting string to char

        char[] chars = inputString.toCharArray();

        //finding duplicate

        FDA(chars);

    }

    public static void FDA(char[] chars)
    {
        //ASCII Character between 0 to 127

        int [] charCount = new int[128];

        //counting each characters

        for (char ch : chars)
        {
            charCount[ch]++;


        }
            //print duplicate

        System.out.println("Duplicate characters...");
        for (int i=0;i<charCount.length;i++)
        {
            if (charCount[i]>1)
            {
                System.out.println((char) i + " - "+ charCount[i]) ;
            }
        }
    }
}
