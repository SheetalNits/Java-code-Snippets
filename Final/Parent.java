public class Parent {
	protected final int COUNT = 122;  //value of COUNT cannot be changed
	
	//display method cannot be overridden
	public final void display(){
		System.out.println("COUNT: " + COUNT);
	}
}
