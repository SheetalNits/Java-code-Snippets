
public class ArrayOfObjectsTester {
	public static void main(String[] args){
		Employee[] employee = new Employee[3];
		employee[0] = new Employee("David", 1001);
		employee[1] = new Employee("Smith",1002);
		employee[2] = new Employee("Xavier", 1003);
		for(int index=0; index<employee.length; index++){
			employee[index].display();
		}
	}
}
