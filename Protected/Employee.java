
public class Employee {
	protected String employeeName;
	protected int employeeId;
	
	public Employee(){
		this.employeeId = 0;
		this.employeeName = null;
	}
	public Employee(String employeeName, int employeeId){
		this.employeeName = employeeName;
		this.employeeId = employeeId;
	}	
}
