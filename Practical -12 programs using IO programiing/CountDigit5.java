import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountDigit5 {
    public static void main(String[] args) {
        // Check if the filename is provided as a command-line argument
        if (args.length != 1) {
            System.err.println("Hello.txt");
            System.exit(1);
        }

        // Read the filename from the command-line argument
        String filename = args[0];
        int count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            // Read each line from the file
            while ((line = br.readLine()) != null) {
                // Count the occurrences of digit 5 in each line
                for (int i = 0; i < line.length(); i++) {
                    if (line.charAt(i) == '5') {
                        count++;
                    }
                }
            }
            System.out.println("Number of occurrences of digit 5: " + count);
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}
