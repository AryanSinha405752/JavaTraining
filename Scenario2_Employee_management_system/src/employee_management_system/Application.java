package employee_management_system;

import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		System.out.print("Enter employee name: ");
//		String empname=sc.nextLine();
//		System.out.print("Enter employee ID: ");
//		String empid=sc.next();
//		System.out.print("Enter employee salary: ");
//		double sal=sc.nextDouble();
//		Employee emp=new Employee(empid,empname,sal);
		Employee emp=new Employee("21bai1341","Aryan sinha",60000);
		Employee emp2= new Employee("21bai1250", "Aditya mishra", 60000);
		emp.setSalary(1000);
		System.out.println( emp.displayEmployeeDetails());
		emp.setSalary(-2000);
		
		System.out.println( emp.displayEmployeeDetails());
		sc.close();
		
	}
}
