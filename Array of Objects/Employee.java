
public class Employee {
	private int employeeId;
	private String employeeName;	
	
	public Employee(String employeeName, int employeeId){
		this.employeeName = employeeName;
		this.employeeId = employeeId;
		System.out.println("Employee(String,int) - Two parameters Constructor");
	}
	public void display(){
		System.out.println("Employee Name: " + this.employeeName + "   Employee ID: " + this.employeeId);
	}
}
