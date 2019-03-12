
public class ConstructorOverloadingTester {
	public static void main(String[] args){
		Employee emp1 = new Employee();
		Employee emp2 = new Employee(1001);
		Employee emp3 = new Employee("George");
		Employee emp4 = new Employee("James",5001);
		System.out.println();
		System.out.println("Employee Details:");
		System.out.println();
		emp1.display();
		emp2.display();
		emp3.display();
		emp4.display();
	}
}
