
public class Employee {
	private static int employeeCount;
	
	static{
		System.out.println("Static Block - Employee");
		employeeCount = 0;
	}
	public Employee(){
		employeeCount++;
	}
	public static int getEmployeeCount(){
		return employeeCount;
	}
}
