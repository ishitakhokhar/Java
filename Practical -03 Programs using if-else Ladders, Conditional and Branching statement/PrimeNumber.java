
//Write a program to check that the given number is prime or not.
import java.util.Scanner;

class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();
		int count = 0, i;
		for (i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println("Prime number");
		} else {
			System.out.println(" Not Prime number");

		}
		sc.close();
	}
}
