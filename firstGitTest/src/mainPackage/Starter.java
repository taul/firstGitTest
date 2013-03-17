package mainPackage;
import threadHandling.*;

public class Starter {

	public static void main(String[] args){
		Thread t1 = new Thread(new ThreadTesting("one"));
		Thread t2 = new Thread(new ThreadTesting("two"));
		Thread t3 = new Thread(new ThreadTesting("three"));
		t1.start();
		t2.start();
		t3.start();
	}
}
