//Taking user input through Scanner class

import java.util.Scanner;

class TakingInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input 1");
		int x = sc.nextInt();

		System.out.println("Enter input 2");
		int y = sc.nextInt();

		int sum = x + y;
		System.out.println(sum);
		sc.close();
	}
}
