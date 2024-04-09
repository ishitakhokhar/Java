final class Abc{
	final int a=10;
	Abc(){
		a=20;
	}
	final void display(){
		System.out.println("Final method");
	}
}
class Bcd extends Abc{
	void display(){
		System.out.println("Child class method");
	}
}
class FinalDemo{
	public static void main(String[] args) {
		Bcd b=new Bcd();	
	}
}