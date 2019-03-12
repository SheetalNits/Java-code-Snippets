
public class UseOfSuperTester {
	public static void main(String[] args){
		SoftwareEngineer se1 = new SoftwareEngineer();
		SoftwareEngineer se2 = new SoftwareEngineer("Kevin",2100,"Banking");
		
		System.out.println("Details of Software Engineer-1: ");
		se1.displaySEDetils();
		
		System.out.println();
		System.out.println("Details of Software Engineer-2: ");
		se2.displaySEDetils();
	}
}
