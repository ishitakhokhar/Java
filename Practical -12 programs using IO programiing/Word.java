
// Write a program to replace all “word1” by “word2” from a file1, and output is written to file2
// file and display the no. of replacement.
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Word {

    public static void main(String[] args) {
        String name = "Name.txt";
        String name2 = "Name2.txt";
        String word1 = "Word1";
        String word2 = "word2";
        int replacements = 0;
        try (FileReader fileReader = new FileReader(name);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                FileWriter fileWriter = new FileWriter(name2);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                int count = countReplacements(line, word1);
                line = line.replaceAll(word1, word2);
                replacements += countReplacements(line, word2);
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
            System.out.println("Number of replacements : " + replacements);
        } catch (IOException e) {
            System.err.println("Error : " + e.getMessage());
        }
    }

    private static int countReplacements(String line, String word2) {
        int count = 0;
        int index = line.indexOf(word2);
        while (index != -1) {
            count++;
            index = line.indexOf(word2, index + 1);
        }
        return count;
    }
}
