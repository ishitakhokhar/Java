
//Write a program that reads a number in meters, converts it to feet, and displays the result.
import java.util.Scanner;

class Meter {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter in Meter : ");
		double meter = sc.nextDouble();
		System.out.println("feet = " + (meter * 3.281));
		sc.close();
	}
}