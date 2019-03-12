
public class Employee {
	private String employeeName;
	private int employeeId;
	
	public Employee(){
		this.employeeId = 0;
		this.employeeName = null;
	}
	public Employee(String employeeName, int employeeId){
		this.employeeName = employeeName;
		this.employeeId = employeeId;
	}
	public void displayEmployeeDetails(){
		System.out.println("Employee Name: " + this.employeeName);
		System.out.println("Employee ID: " + this.employeeId);
	}
}
