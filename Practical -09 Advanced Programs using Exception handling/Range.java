// Write a program in java if number is less than 10 and greater than 50 it generate the
// exception out of range. Else it displays the square of number.
import java.util.Scanner;

class OutOfRangeException extends Exception {
    public OutOfRangeException(String message) {
        super(message);
    }
}
public class Range {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        try {
            if (number < 10 || number > 50) {
                throw new OutOfRangeException("Number is out of range!");
            } else {
                System.out.println("Square of the number: " + (number * number));
            }
        } catch (OutOfRangeException e) {
            System.out.println(e.getMessage());
        }
    }
}

