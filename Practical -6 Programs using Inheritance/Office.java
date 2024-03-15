import java.util.Scanner;
class Member{
	String name;
	int age;
	double phonenumber;
	String address;
	double salary;
	Member(String name,int age,double phonenumber,String address,double salary){
		this.name=name;
		this.age=age;
		this.phonenumber=phonenumber;
		this.address=address;
		this.salary=salary;
	}
	void printsalary(){	
		System.out.println("salary="+salary);
	}
}
class Employe extends Member{
	String specialization;
	 Employe(String name,int age,double phonenumber,String address,double salary,String specialization){
		super(name,age,phonenumber,address,salary);
		this.specialization=specialization;
	}
	void display(){
		printsalary();
		System.out.println("name="+name);
		System.out.println("age="+age);
		System.out.println("phonenumber="+phonenumber);
		System.out.println("address="+address);
		System.out.println("specialization="+specialization);
	}
}
class Manager extends Member{
	String department;
	 Manager(String name,int age,double phonenumber,String address,double salary,String department){
		super(name,age,phonenumber,address,salary);
		this.department=department;
	}
	void displayname(){
		printsalary();
		System.out.println("name="+name);
		System.out.println("age="+age);
		System.out.println("phonenumber="+phonenumber);
		System.out.println("address="+address);
		System.out.println("department="+department);
	}
	
}
public class Office{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employe details : ");
		System.out.println("Enter Employe name : ");
		String name=sc.nextLine();
		System.out.println("Enter Employe age : ");
		int age=sc.nextInt();
		System.out.println("Enter Employe phonenumber : ");
		double phonenumber=sc.nextDouble();
		System.out.println("Enter Employe salary : ");
		double salary=sc.nextDouble();
		System.out.println("Enter Employe address : ");
		sc.nextLine();
		String address=sc.next();
		System.out.println("Enter Employe specialization");
		sc.nextLine();
		String specialization=sc.next();
		Employe e1=new Employe(name,age,phonenumber,address,salary,specialization);
		e1.display();

		System.out.println("Enter Manager details : ");
		System.out.println("Enter Manager name : ");
		sc.nextLine();
		String name1=sc.next();
		System.out.println("Enter Manager age : ");
		int age1=sc.nextInt();
		System.out.println("Enter Manager phonenumber : ");
		double phonenumber1=sc.nextDouble();
		System.out.println("Enter Manager salary : ");
		double salary1=sc.nextDouble();
		System.out.println("Enter Manager address : ");
		sc.nextLine();
		String address1=sc.next();
		System.out.println("Enter Manager department");
		sc.nextLine();
		String department=sc.next();
		Manager m1=new Manager(name,age,phonenumber,address,salary,department);
		m1.displayname();
	}
}