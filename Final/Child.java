
//Child class cannot be inherited
public final class Child extends Parent{
	public Child(){
		System.out.println("COUNT in Child: " + COUNT);
		//COUNT++;  
		//The above code will lead to compile time error as the value of final attribute cannot be modified
	}
	
	//the below code will lead to compilation error as final method cannot be overridden
	/*public void display(){
		System.out.println("display in Child");
	}*/
}
