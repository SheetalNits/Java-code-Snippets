
public class ApplicationTester {
	public static void main(String[] args){
		Employee employee = new Employee();
		employee.setEmployeeNumber(2001);
		employee.setSalary(5000.0);
		System.out.println("Salary before update: " + employee.getSalary());
		employee.updateSalary(1500.0);
		System.out.println("Salary after update: " + employee.getSalary());
	}
}
