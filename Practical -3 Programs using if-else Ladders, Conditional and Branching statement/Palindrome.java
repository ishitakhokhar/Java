
//Write a program to find that given number is palindrome or not
import java.util.Scanner;

class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int a = sc.nextInt();
		int sum = 0;
		int temp = a;
		while (a != 0) {
			int r = a % 10;
			sum = sum * 10 + r;
			a = a / 10;

		}

		if (temp == sum) {
			System.out.println("palindrome number");
		} else {
			System.out.println(" not palindrome number");
			sc.close();
		}
	}
}