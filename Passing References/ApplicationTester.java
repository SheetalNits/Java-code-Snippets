
public class ApplicationTester {
	public static void main(String[] args){
		Account account1 = new Account();
		Account account2 = new Account();
		UtilityClass reference = new UtilityClass();
		
		account1.setAccountNumber(1003);
		account1.setBalanceAmount(2000.0);
		account2.setAccountNumber(1001);
		account2.setBalanceAmount(3000);
		
		if(reference.compareAccount(account1, account2) == true){
			System.out.println("Account number " + account1.getAccountNumber() + " is EQUAL to " + "Account number " + account2.getAccountNumber());
		}else{
			System.out.println("Account number " + account1.getAccountNumber() + " is NOT EQUAL to " + "Account number " + account2.getAccountNumber());
		}
	}
}
