
//Write a program to calculate the area of Rectangle.
import java.util.Scanner;

class Rectangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter width");
		double w = sc.nextDouble();

		System.out.println("Enter length");
		double l = sc.nextDouble();
		System.out.println("Area of Rectangle=" + (w * l));
		sc.close();
	}
}