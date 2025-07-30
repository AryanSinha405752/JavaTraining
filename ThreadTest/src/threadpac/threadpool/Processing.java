package threadpac.threadpool;

public class Processing implements Runnable{
	int msg;
	
	public Processing(int msg) {
		super();
		this.msg = msg;
	}


	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" task recieved "+ msg);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+" TASK DONE "+ msg);
		
	}
}
