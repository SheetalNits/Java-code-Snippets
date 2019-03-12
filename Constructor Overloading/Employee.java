
public class Employee {
	private int employeeId;
	private String employeeName;
	
	public Employee(){
		System.out.println("Default Constructor - Employee");
	}
	public Employee(int employeeId){
		this.employeeId = employeeId;
		System.out.println("Employee(int) - One parameter Constructor");
	}
	public Employee(String employeeName){
		this.employeeName = employeeName;
		System.out.println("Employee(String) - One parameter Constructor");
	}
	public Employee(String employeeName, int employeeId){
		this.employeeName = employeeName;
		this.employeeId = employeeId;
		System.out.println("Employee(String,int) - Two parameters Constructor");
	}
	public void display(){
		System.out.println("Employee Name: " + this.employeeName + "   Employee ID: " + this.employeeId);
	}
}
