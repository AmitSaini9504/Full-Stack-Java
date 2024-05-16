import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderInput {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        System.out.print("Enter your favourite color :");
        String color = reader.readLine();

        System.out.println("Your favourite color is:" +color);
        reader.close();
    }
}
