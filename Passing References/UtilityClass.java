
public class UtilityClass {
	public boolean compareAccount(Account account1, Account account2){
		if(account1.getAccountNumber() == account2.getAccountNumber()){
			return true;
		}
		return false;
	}
}
