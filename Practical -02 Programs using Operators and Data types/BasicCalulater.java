
/*Write a program to create basic calculator by getting 2 numbers and 1 string (operation) from
the user and apply the operation given in a string on the given numbers.*/
import java.util.Scanner;

class BasicCalulater {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number 1");
		int x = sc.nextInt();
		System.out.println("Enter number 1");
		int y = sc.nextInt();
		System.out.println("Enter operator");
		sc.nextLine();
		String c = sc.next();
		if (c.equals("+")) {
			System.out.println(x + y);
		} else if (c.equals("-")) {
			System.out.println(x - y);
		} else if (c.equals("*")) {
			System.out.println(x * y);
		} else if (c.equals("/")) {
			if (y == 0) {
				System.out.println("Invallid");
			} else {
				System.out.println(x / y);
			}
		} else {
			System.out.println("Symbol not found");
			sc.close();
		}
	}
}