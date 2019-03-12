
public class InterfaceTester {
	public static void main(String[] args){
		MyClassOne one = new MyClassOne();
		one.display("Interface demo");
		one.myClassMethod();
		
		MyInterface1 reference = new MyClassOne();
		reference.display("Hi. This is display method");
		
		/*The below code will lead to compilation error as the reference is of interface type. Using reference of interface type, we can call only 
		the overridden method*/
		
		//reference.myClassMethod();
		
		//Uncomment the code given below and understand the output
		
		/*MyClassTwo two = new MyClassTwo();
		two.display("display - MyClassTwo");
		two.myMethod();
		two.newMethod();*/
		
		/*MyClassThree three = new MyClassThree();
		three.display("Interface can extend multiple interfaces");
		three.myMethod();
		three.someMethod();*/
	}
}
