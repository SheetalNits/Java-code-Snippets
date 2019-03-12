
public class StringTester {
	public static void main(String[] args){
		String str1 = new String("GFT");		
		String str2 = str1;
		System.out.println("str1 = " + str1);
		System.out.println("str2 = " + str2);

		String str3 = new String("GFT");
		System.out.println("== operator : "+(str1==str3));
		System.out.println("equals operator : "+(str1.equals(str3)));
		
		str1 = str1.toLowerCase();
		System.out.println("str1 = " + str1);
		System.out.println("str2 = " + str2);  //Observe the output
		
		System.out.println("equals operator : "+(str1.equals(str3)));
		System.out.println("equalsIgnoreCase operator : "+(str1.equalsIgnoreCase(str3)));
		
	}
}
