
public abstract class Employee {
	private int employeeId;
	private String employeeName;
	protected double salary;
	
	public Employee(String employeeName, int employeeId){
		this.employeeName = employeeName;
		this.employeeId = employeeId;
		this.salary = 0.0;
	}
	public void display(){
		System.out.println("Employee Name: " + this.employeeName);
		System.out.println("Employee ID: " + this.employeeId);
		System.out.println("Salary: " + this.salary);
	}
	public abstract void computeSalary();
}
