
// Write a java program to create Custom Exception (DarshanUniException). Catch this exception
// using throw clause and print appropriate message
import java.util.Scanner;

/**
 * InnerCustom
 */
class InnerCustom extends Exception {
    public InnerCustom(String s) {
        super(s);
    }
}

/**
 * Custom
 */
public class Custom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter your marks");
        int marks = sc.nextInt();
        if (marks >= 35)
            System.err.println("You are pass");
        else
            System.err.println("you are fail");
    }

}