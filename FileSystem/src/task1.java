import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class task1 {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\amits\\IdeaProjects\\Grass Revision\\FileSystem\\src\\test.txt";
        char character = 'H';

        try {
            // Creating a FileWriter object in append mode
            FileWriter fileWriter = new FileWriter(filePath, true);
            // Creating a BufferedWriter object for efficient writing
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            // Append the character followed by a space
            bufferedWriter.write(character + " ");

            // Close the BufferedWriter
            bufferedWriter.close();

            System.out.println("Character '" + character + "' appended to '" + filePath + "' with a space.");
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
