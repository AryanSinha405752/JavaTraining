package employee_management_system;

public class Employee {
	private String employeeId,name;
	private double salary;
	
	Employee(){
		employeeId="";
		name="";
		salary=0;
	}
	Employee(String empid, String name,double salary ){
		this.employeeId=empid;
		this.name=name;
		this.salary=salary;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		if(salary>=0) {
			this.salary = salary;
		}
		else {
			System.out.println("Invalid salary! ");
//			this.salary =0;
			
		}
		
	}
	public String displayEmployeeDetails() {
		return "Employee " + employeeId + " name=" + name + " salary=" + salary ;
	}
	
	
}
