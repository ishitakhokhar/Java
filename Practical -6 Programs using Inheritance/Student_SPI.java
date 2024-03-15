import java.util.Scanner;

class Student {
	int id_No;
	int no_of_subject;
	int subject_code[];
	int subject_credit[];
	int sub_grade[];
	double spi;

	Student(int subject_credit[], int sub_grade[], int no_of_subject) {
		this.subject_credit = subject_credit;
		this.sub_grade = sub_grade;
		this.no_of_subject = no_of_subject;
	}

	void calculate_spi() {
		int sum = 0, sum1 = 0;
		for (int i = 0; i < no_of_subject; i++) {
			sum1 = sum + subject_credit[i];
			sum = sum + (subject_credit[i] * sub_grade[i]);
		}
		spi = sum / sum1;
		System.out.println("spi=" + spi);
	}
}

class Student_SPI {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(args[0]);
		System.out.println("Enter number of subject");
		int sub = sc.nextInt();
		Student s[] = new Student[n];
		for (int i = 0; i < n; i++) {
			int subject_credit[] = new int[sub];
			int sub_grade[] = new int[sub];
			int subject_code[] = new int[sub];
			int id_No[] = new int[n];
			System.out.println("Enter student id no : ");
			id_No[i] = sc.nextInt();
			for (int j = 0; j < sub; j++) {
				System.out.println("Enter subject code : ");
				subject_code[j] = sc.nextInt();
				System.out.println("Enter credit : ");
				subject_credit[j] = sc.nextInt();
				System.out.println("Enter grade : ");
				sub_grade[j] = sc.nextInt();
			}
			s[i] = new Student(subject_credit, sub_grade, sub);
			s[i].calculate_spi();
			sc.close();
		}
	}
}