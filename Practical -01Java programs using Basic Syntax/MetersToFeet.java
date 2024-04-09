
//Write a program that reads a number in meters, converts it to feet, and displays the result.
import java.util.Scanner;

public class MetersToFeet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length in meter: ");
        double meters = sc.nextDouble();
        double feet = meters * 3.281;
        System.out.println("Length in feet" + feet);
        sc.close();
    }
}
