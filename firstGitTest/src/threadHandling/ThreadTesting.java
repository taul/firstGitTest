package threadHandling;

import java.util.Random;

public class ThreadTesting implements Runnable{

	String name;
	int time;
	Random r = new Random();
	
	public ThreadTesting(String s){
		name = s;
		time = r.nextInt(999);
	}
	
	public void run(){
		try{
			System.out.printf("%s is sleeping for %d\n", name, time);
			Thread.sleep(1000);
			System.out.printf("%s is done\n", name);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
