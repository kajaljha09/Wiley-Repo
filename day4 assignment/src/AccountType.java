


public enum AccountType {
	SAVING(500.0), CURRENT(1000.0);
	
	private double minLimit;
	private AccountType(double minLimit) {
		this.minLimit=minLimit;
	}
	
	public boolean isAccountBalanceValid(double amount) {
		if(amount<minLimit) {
			return false;
		}
		return true;
	}
}