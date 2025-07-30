package threadpac.Producer_consumer_blockingqueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Application {
	
	public static void main(String[] args) {
		
		BlockingQueue<Integer> ques=new ArrayBlockingQueue<Integer>(5);
		Thread t1=new Thread(new Producer(ques));
		Thread t2=new Thread(new Consumer(ques));
		
		t1.start();
		t2.start();
		
	}
}
