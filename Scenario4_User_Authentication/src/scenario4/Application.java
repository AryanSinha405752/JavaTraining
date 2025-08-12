package scenario4;

import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		Authenticator auth=new Authenticator();
		Scanner sc=new Scanner(System.in);
//		auth.authenticate("user1","pass@123");
		System.out.print("Enter your username: ");
		String username=sc.next();
		System.out.print("Enter your password: ");
		String password=sc.next();
		auth.authenticate(username, password);
//		
		sc.close();
	}
}
