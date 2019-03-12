public class EmployeeTester {
	
	public static void main(String[] args){
		Employee emp = new Employee();
		emp.setEmployeeId(1001);
		emp.setBasicPay(15000.0f);
		System.out.println("Employee ID: " + emp.getEmployeeId());
		System.out.println("Basic Pay: " + emp.getBasicPay());
	}
}
