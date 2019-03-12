
public class AggregationTester {
	public static void main(String[] args){
		Department department = new Department();
		Faculty faculty = new Faculty();
		
		department.setDepartmentName("Computer Science");
		faculty.setFacultyId(1001);
		faculty.setFacultyName("Smith");
		department.setFaculty(faculty);
		
		System.out.println("Department Name: " + department.getDepartmentName());
		System.out.println("Faculty Name: " + department.getFaculty().getFacultyName());
		System.out.println("Faculty ID: " + department.getFaculty().getFacultyId());
	}
}
