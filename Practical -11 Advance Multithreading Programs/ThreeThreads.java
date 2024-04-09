// Write a java program that implements a multi-thread application that has
// three threads. First thread generates random integer every 1 second and if
// the value is even, second thread computes the square of the number and
// prints. If the value is odd, the third thread will print the value of cube of
// the number
import java.util.Random;
class Thread1 extends Thread{
	Random r=new Random();
	public void run(){
		for (;;) {
			try{
			sleep(100);
		}
		catch(InterruptedException e){
		System.out.println(e);
	}
		
			int n=r.nextInt(100);
			if(n%2==0){
				Thread2 t2=new Thread2(n);
				t2.start();
			}
			else if(n%2!=0){
				Thread3 t3=new Thread3(n);
				t3.start();
			}
		}
	}
}
class Thread2 extends Thread{
	int n;
	Thread2(int n){
		this.n=n;
	}
	public void run(){
		int square=n*n;
		System.out.println("square of a number "+n+"="+square);
	}
}
class Thread3 extends Thread{
	int n;
	Thread3(int n){
		this.n=n;
	}
	public void run(){
		int cube=n*n*n;
		System.out.println("cube of a number "+n+"="+cube);
	}
}
public class ThreeThreads{
	public static void main(String[] args) {
		Thread1 t1=new Thread1();
		t1.start();
	}
}