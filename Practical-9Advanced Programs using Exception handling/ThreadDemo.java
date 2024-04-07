// Write a java Multithread program using Thread class. 
class A extends Thread{
	public void run(){
		for (int i=0;i<5;i++) {
			System.out.println("Thread 1");
				}
		
		try{
			Thread.sleep(3);
		}
		catch(InterruptedException e){
			System.out.println(e);
		}
	}
}
class B extends Thread{
	public void run(){
		for (int i=0;i<5;i++) {
			System.out.println("Thread 2");
		}
		
	}
}
class ThreadDemo{
	public static void main(String[] args) {
		A a=new A();
		B b=new B();
		a.start();
		b.start();
	}
}