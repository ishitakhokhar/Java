//Write a program that prompts the user to enter three numbers. Find the largest number.

import java.util.Scanner;

class Largest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number a");
		int a = sc.nextInt();
		System.out.println("Enter number b");
		int b = sc.nextInt();
		System.out.println("Enter number c");
		int c = sc.nextInt();
		if (a > b) {
			if (a > c) {
				System.out.println("a is largest");
			} else {
				System.out.println("c is largest");
			}
		}
		if (b > a) {
			if (b > c) {
				System.out.println("b is largest");
			} else {
				System.out.println("c is largest");
				sc.close();
			}
		}
	}
}