
public enum AccountType {
    CURRENT(0.5),SAVINGS(6);
	private double interestRate;
	
	AccountType(double d){
		interestRate=d;
	}

	public double getInterestRate() {
		return interestRate;
	}

	
	

	
}
