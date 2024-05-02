// Write a program to create two threads, one thread will print odd numbers and second thread
// will print even numbers between 1 to 20 numbers.
class Odd implements Runnable {
	public void run() {
		for (int i = 1; i <= 20; i++) {
			if (i % 2 != 0) {
				System.out.println("Odd number=" + i);
			}
		}
	}
}

class Even implements Runnable {
	public void run() {
		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 0) {
				System.out.println("Even number=" + i);
			}
		}
	}
}

public class OddEven {
	public static void main(String[] args) {
		Odd o = new Odd();
		Even e = new Even();
		Thread t = new Thread(o);
		Thread t1 = new Thread(e);
		t.start();
		t1.start();
	}
}