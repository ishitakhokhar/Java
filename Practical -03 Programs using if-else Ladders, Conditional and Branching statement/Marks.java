import java.util.Scanner;

class Marks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks of subject 1");
		double s1 = sc.nextDouble();
		System.out.println("Enter marks of subject 2");
		double s2 = sc.nextDouble();
		System.out.println("Enter marks of subject 3");
		double s3 = sc.nextDouble();
		System.out.println("Enter marks of subject 4");
		double s4 = sc.nextDouble();
		System.out.println("Enter marks of subject 5");
		double s5 = sc.nextDouble();
		double total = s1 + s2 + s3 + s4 + s5;
		double marks = (total * 100) / 500;
		if (marks == 60 && marks > 60) {
			System.out.println("First division");
		} else if (marks >= 50 && marks <= 59) {
			System.out.println("Second division");
		} else if (marks >= 40 && marks <= 49) {
			System.out.println("Third division");
		} else {
			System.out.println("Fail");
			sc.close();
		}
	}
}