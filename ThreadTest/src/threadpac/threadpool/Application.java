package threadpac.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors; 

public class Application {
	public static void main(String[] args) {
		ExecutorService e=Executors.newFixedThreadPool(2);
		Processing p1=new Processing(1);
		e.execute(p1);
		Processing p2=new Processing(2);
		e.execute(p2);
		Processing p3=new Processing(5);
		e.execute(p3);
		e.shutdown();
		while(!e.isTerminated()) {
			
		}
		System.out.println("Ended");
		
	}
}
