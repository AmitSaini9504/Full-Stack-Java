import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class task2 {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\amits\\IdeaProjects\\Grass Revision\\FileSystem\\src\\test.txt"; // Path to your file
        char character = 'X'; // Character to append

        try {
            // Create a FileWriter object in append mode
            FileWriter fileWriter = new FileWriter(filePath, true);
            // Create a BufferedWriter object for efficient writing
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            // Append the character followed by a newline
            bufferedWriter.write(character + "\n");

            // Close the BufferedWriter
            bufferedWriter.close();

            System.out.println("Character '" + character + "' appended to '" + filePath + "' on a new line.");
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
