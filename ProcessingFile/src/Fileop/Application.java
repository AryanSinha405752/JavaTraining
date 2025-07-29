package Fileop;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter text: ");
//		String str= sc.nextLine();
//		System.out.println(str);
//		System.out.println("Working Directory = " + System.getProperty("user.dir"));
//		try {
//	    File f = new File("mytext.txt");
//	    Scanner sc = new Scanner(f);
//	    while (sc.hasNextLine()) {
//	        String str = sc.nextLine();
//	        System.out.println(str);
//	    }
//	    sc.close();
//	} catch (FileNotFoundException e) {
//	    System.out.println("File not found: " + e.getMessage());
//	}
		FileUtils f= new FileUtils();
		try {
			f.sub10(14);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			f.sub10(2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		



	}

}
