
//Write a program to find maximum no from given 3 no.(without if-else) 
import java.util.Scanner;

class Large {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number a");
		int a = sc.nextInt();
		System.out.println("Enter number b");
		int b = sc.nextInt();
		System.out.println("Enter number c");
		int c = sc.nextInt();
		int large = (a > b ? (a > c ? a : c) : (b > c ? b : c));
		System.out.println("Largest number is" + large);
		sc.close();
	}
}