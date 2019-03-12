
public class MethodTester {
	public static void main(String[] args){
		ElectricityBill bill = new ElectricityBill();
		bill.setUnitsConsumed(49);
		bill.calculateBillAmount();
		System.out.println("Units Consumed: " + bill.getUnitsConsumed());
		System.out.println("Amount to pay: " + bill.getBillAmount());
		
		System.out.println();
		bill.setUnitsConsumed(60);
		bill.calculateBillAmount();
		System.out.println("Units Consumed: " + bill.getUnitsConsumed());
		System.out.println("Amount to pay: " + bill.getBillAmount());
	}
}
