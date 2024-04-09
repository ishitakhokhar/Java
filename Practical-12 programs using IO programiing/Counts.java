
// Write a program that counts number of characters, words, and lines in a file. Use exceptions
// to check whether the file that is read exists or not.
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Counts {
    public static void main(String[] args) {
        try {
            int characters = 0;
            int words = 0;
            int line = 0;
            FileReader fileReader = new FileReader("Hello.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line1;
            while ((line1 = bufferedReader.readLine()) != null) {
                line++;
                words += line1.split("\\s+").length;
                characters += line1.length();
            }
            fileReader.close();
            bufferedReader.close();
            System.err.println("Charactor count : " + characters);
            System.err.println("Word count=" + words);
            System.err.println("Line count=" + line);
        } catch (IOException e) {
            System.err.println("Error=" + e.getMessage());
            System.err.println("Not found");
        }
    }
}