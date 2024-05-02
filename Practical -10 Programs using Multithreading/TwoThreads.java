// Write an application that executes two threads. One thread displays "Good Morning" every
// 1000 milliseconds & another thread displays "Good Afternoon" every 3000 milliseconds.
// Create the threads by implementing the Runnable interface.
class GoodMorning implements Runnable {
	public void run() {
		for (;;) {
			try {
				Thread.sleep(1000);
				System.out.println("Good Morning");
			} catch (InterruptedException e) {

			}
		}
	}
}

class GoodAfternoon implements Runnable {
	public void run() {
		for (;;) {
			try {
				Thread.sleep(3000);
				System.out.println("Good Afternoon");
			} catch (InterruptedException e) {

			}
		}
	}
}

class TwoThreads {
	public static void main(String[] args) {
		GoodMorning gm = new GoodMorning();
		GoodAfternoon gf = new GoodAfternoon();
		Thread t1 = new Thread(gm);
		Thread t2 = new Thread(gf);
		t1.start();
		t2.start();
	}
}