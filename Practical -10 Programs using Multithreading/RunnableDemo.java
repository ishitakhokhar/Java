// Write a java Multithread program using Runnable Interface
class A implements Runnable {
	public void run() {
		System.out.println("End of Runnable");
	}
}

class B implements Runnable {
	public void run() {
		System.out.println("Start of Runnable");
	}
}

public class RunnableDemo {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		Thread t1 = new Thread(a);
		Thread t = new Thread(b);
		t1.start();
		t.start();
		System.out.println("This is thread");
	}
}