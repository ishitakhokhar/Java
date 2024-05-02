
// Write a program to replace all “word1” by “word2” from a file1, and output is written to file2
// file and display the no. of replacement.
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Word {

    public static void main(String[] args) {
        String Name = "Name.txt";
        String Name2 = "Name2.txt";
        String word1 = "word1";
        String word2 = "word2";
        try {
            FileReader fileReader = new FileReader(Name);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            FileWriter fileWriter = new FileWriter(Name2);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                line = line.replace("Word1", "word2");
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            bufferedReader.close();

        } catch (IOException e) {
            System.err.println("Error : " + e.getMessage());
            System.err.println("Not found");
        }
    }
}