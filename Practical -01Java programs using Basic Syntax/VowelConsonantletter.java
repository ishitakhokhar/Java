
//Write a program that prompts the user to enter a letter and check whether a letter is a vowel
//or constant.
import java.util.Scanner;

public class VowelConsonantletter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter letter");
        String letter = sc.next();
        if (letter == "a" || letter == "e" || letter == "i" || letter == "o" || letter == "u" || letter == "A"
                || letter == "E" || letter == "I" || letter == "O"
                || letter == "U") {
            System.out.println("the letter is vowel");
        } else {
            System.out.println("the letter is consonant");
        }
        sc.close();
    }

}
