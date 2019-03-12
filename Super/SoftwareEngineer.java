
public class SoftwareEngineer extends Employee{
	private String projectName;
	
	public SoftwareEngineer(){
		this.projectName = null;
	}
	public SoftwareEngineer(String employeeName, int employeeId, String projectName){
		super(employeeName, employeeId);  //This statement must be the first statement in the sub class constructor
		this.projectName = projectName;
	}
	public void displaySEDetils(){
		System.out.println("Project Name: " + this.projectName);
		super.displayEmployeeDetails();
	}
}
