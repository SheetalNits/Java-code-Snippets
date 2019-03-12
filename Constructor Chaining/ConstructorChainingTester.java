
public class ConstructorChainingTester {
	@SuppressWarnings("unused")
	public static void main(String[] args){
		ParentClass parent = new ParentClass();  //Only ParentClass default constructor will be invoked
		ChildClass child = new ChildClass(); //Both ParentClass and ChildClass default constructors will be invoked
	}
}
