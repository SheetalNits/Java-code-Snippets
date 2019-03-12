package package2;

public class PackageTester {
	public static void main(String[] args){
		Child c = new Child();
		c.childMethod();
		
		/*Try writing the below code and observe
		c.parentMethod();
		
		Change the access modifier of Parent Constructor to protected and observe
		Change the access modifier of Parent Constructor to protected and try to create an instance of Parent class and see what happens
		Change the access modifier of Parent Constructor to default and try to create an instance of Parent class and see what happens
		Try invoking the protected method of Parent class inside the Child class and see what happens*/
	}
}
