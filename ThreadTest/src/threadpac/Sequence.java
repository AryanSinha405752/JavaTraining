package threadpac;

public class Sequence {
	private int val=0;
	public synchronized int getnext() {

			val++;
			return val;
				
	}
}
