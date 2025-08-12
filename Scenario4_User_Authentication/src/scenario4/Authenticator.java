package scenario4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Authenticator {
	Map<String, String> mp=new HashMap<String, String>();
	Authenticator(){
		loadUsers();
	}
	public void loadUsers() {
		String file="users.txt";
		try {
			BufferedReader br= new BufferedReader(new FileReader(file));
			String line;
			while((line=br.readLine())!= null) {
				String values[]=line.split(":");
				mp.put(values[0], values[1]);
			}
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File not found!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	public void authenticate(String username, String password) {
		String b= mp.get(username);
		if( b!=null &&b.equals(password)) {
			
			System.out.println("Welcome User");
		}
		else {
			System.out.println("Invalid User!!");
		}
		
		
	}
}
