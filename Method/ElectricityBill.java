
public class ElectricityBill {
	private int unitsConsumed;
	private double billAmount;
	
	public int getUnitsConsumed() {
		return unitsConsumed;
	}
	public void setUnitsConsumed(int unitsConsumed) {
		this.unitsConsumed = unitsConsumed;
	}
	public double getBillAmount() {
		return billAmount;
	}
	public void setBillAmount(double billAmount) {
		this.billAmount = billAmount;
	}
		
	//method to calculate the bill amount based on the units consumed
	public void calculateBillAmount(){
		if(this.unitsConsumed <= 50){
			this.billAmount = this.unitsConsumed * 2;
		}else if(this.unitsConsumed <= 100){
			this.billAmount = this.unitsConsumed * 4;
		}else{
			this.billAmount = this.unitsConsumed * 6;
		}		
	}
}
