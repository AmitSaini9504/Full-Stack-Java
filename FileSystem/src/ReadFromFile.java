package inputoutput_handling;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class ReadFromFile {
    public static void main(String[] args) {
        try {
            /*
            File file = new File("src/main/java/inputoutput_handling/testfile.txt");
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()) // true/false
            {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
            */
            String filePath = "C:\\Users\\amits\\IdeaProjects\\Grass Revision\\FileSystem\\src\\test.txt";
            FileInputStream fin = new FileInputStream(filePath);
            int i = fin.read();
            System.out.println("i is "+i); // 65 A, 97  a
            System.out.print((char)i);

            int b;
            while ((b = fin.read()) != -1)
            {
                //System.out.println();
                System.out.print((char) b);
            } // EOF
            //////
            FileOutputStream fout = new FileOutputStream(filePath);
            fout.write(65);
            fout.write(65);
            /////////
            String s= "Welcome to Grras, java full stack course";
            byte d[] = s.getBytes();//converting string into byte array
            fout.write(d);
            fin.close();
        } catch (Exception e) {
            System.out.println("Exception "+e.getMessage());
        }
    }
}