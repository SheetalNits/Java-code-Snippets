public class Employee {
	private int employeeId;
	private double basicPay;
	
	public Employee(){
		employeeId = 1001;
		basicPay = 12500.0;
	}

	//Since constructor is used to initialize the attributes of Employee class, we have not used setter method to initalize the attributes
	public int getEmployeeId() {
		return employeeId;
	}
	public double getBasicPay() {
		return basicPay;
	}		
}
