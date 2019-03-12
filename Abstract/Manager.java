
public class Manager extends Employee{
	private int numberOfReportees;
	
	public Manager(String employeeName, int employeeId, int numberOfReportees){
		super(employeeName, employeeId);
		this.numberOfReportees = numberOfReportees;
	}
	public void display(){
		super.display();
		System.out.println("Number of reportees: " + this.numberOfReportees);
	}
	public void computeSalary(){
		System.out.println("Computing salary of Manager...");
		this.salary = 35000.00;
	}
}
