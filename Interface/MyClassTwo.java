
public class MyClassTwo implements MyInterface1, MyInterface2 {	
	public void myMethod() {
		System.out.println("myMethod implemented in MyClassTwo !!!");		
	}	
	public void display(String str) {
		System.out.println("String to display: " + str);		
	}
	public void newMethod(){
		System.out.println("newMethod of MyClassTwo");
	}
}
