package Fileop;

public class FileUtils {
	public void sub10(int n) throws Exception{
		
		if(n<10) {
			throw new Exception("Choose a bigger number");
		}
		System.out.println(n-10);

	}
}
