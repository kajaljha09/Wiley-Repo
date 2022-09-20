
public class BankAccount {
	private int accountId;
	private String accountHolderName;
	AccountType accountType;
	
	public BankAccount(int accountId, String accountHolderName, AccountType accountType) {
		super();
		this.accountId = accountId;
		this.accountHolderName = accountHolderName;
		this.accountType = accountType;	
	}
	

	public double calculateTotalInterest(double amount, int years) throws DepositAmountException  {
		double ans=0;
		double interest=0;
		if(amount>0) {
			if(this.accountType.name().equals("SACVINGS")) {
				interest=this.accountType.getInterestRate();
				ans=(amount*years*interest)/100;
			}
			else if(this.accountType.name().equals("CURRENT")) {
				interest=this.accountType.getInterestRate();
				ans=(amount*years*interest)/100;
			}
		
		return ans;
		}
		else
			throw new DepositAmountException("Please Enter a positive amount");
	}
	


	public int getAccountID() {
		return accountID;
	}

	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

public void setAccountHolderName(String accountHolderName) {
	this.accountHolderName = accountHolderName;
}

}