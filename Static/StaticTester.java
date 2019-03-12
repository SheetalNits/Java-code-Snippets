
public class StaticTester {
	static{
		System.out.println("Static Block - StaticTester");
	}
	public static void main(String[] str){
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		System.out.println("Current employee count: " + Employee.getEmployeeCount());
		Employee emp3 = new Employee();
		System.out.println("Current employee count: " + emp2.getEmployeeCount());
	}
}
