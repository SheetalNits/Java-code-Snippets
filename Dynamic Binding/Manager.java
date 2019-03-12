
public class Manager extends Employee {
	private int numberOfReportees;
	
	public Manager(String employeeName, int employeeId, int numberOfReportees){
		super(employeeName, employeeId);
		this.numberOfReportees = numberOfReportees;
	}
	public void displayDetails(){
		System.out.println("Number of reportees: " + this.numberOfReportees);
	}
}
