package package2;
import package1.Parent;

public class Child extends Parent{
	public Child(){
		System.out.println("Default constructor - Child");
	}
	protected void childMethod(){
		System.out.println("childMethod - protected access modifier");
	}
}
