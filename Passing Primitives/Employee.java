
public class Employee {
	private int employeeNumber;
	private double salary;
	
	public int getEmployeeNumber() {
		return employeeNumber;
	}
	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}	
	
	//method to update the salary
	public void updateSalary(double amount){
		this.salary = this.salary + amount;
	}
}
