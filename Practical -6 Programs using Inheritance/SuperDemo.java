//Demonstrate the use of Super Keyword.
class Abc{
	int num=100;
	Abc(){
		System.out.println("Normal Constructor");
	}
	// SuperDemo(int a){
	// 	System.out.println("Perametrized Constructor");
	// }
	void display(){
		System.out.println("Method of this class");
	}
}
class Demo extends Abc{
	Demo(){
		super();
		super.display();
		System.out.println("Variable of num="+super.num);
	}
}
class SuperDemo{
	public static void main(String[] args) {
		Demo d=new Demo();
	}
}