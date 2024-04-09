
//Write a program to check whether a number is even or odd

import java.util.Scanner;

class EvenOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number :");
		int number = sc.nextInt();
		if (number % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("odd");
			sc.close();
		}
	}
}