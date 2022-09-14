

public class BankAccount {
	private double openingBalance, currentBalance;
	private int accountId;
	private String accountHolderName;
	private static double totalBalance;
	AccountType accountType;

	public BankAccount(int accountId, String accountHolderName, AccountType accountType) {
		this.accountId = accountId;
		this.accountHolderName = accountHolderName;
		this.accountType = accountType;
	}

	public void setOpeningBalance(double openingBalance) {
		if (openingBalance <= 0) {
			System.out.print("Opening Balance should be atleast 1 Rs");
			return;
		}

		if (accountType.isAccountBalanceValid(openingBalance)) {
			this.openingBalance = openingBalance;
			updateCurrentBalance(this.openingBalance, true);
		} else {
			System.out.println(String.format("Request Rejected, You should have minimum of %.1f Rs amount in you account",
					openingBalance));
			return;
		}

//		displayBankInfo();
	}

	public void depositAmount(double amount) {
		if (amount <= 0) {
			System.out.println("Invalid Entry, amount should be atleast 1 Rs");
			return;
		}
		updateCurrentBalance(amount, true);
//		displayBankInfo();
	}

	public void withdrawAmount(double amount) {
		if (amount <= 0) {
			System.out.println("Invalid Entry, amount should be atleast 1 Rs");
			return;
		}
		updateCurrentBalance(amount, false);
//		displayBankInfo();
	}

	private void updateCurrentBalance(double amount, boolean addAmount) {
		// TODO Auto-generated method stub
		if (addAmount) {
			currentBalance += amount;
			updateTotalBalance(amount, addAmount);
		} else if (amount > currentBalance) {
			System.out.println("Requested amount is greater than current balance");
			return;
		} else if (accountType.isAccountBalanceValid(currentBalance - amount)) {
			if (updateTotalBalance(amount, addAmount)) {
				currentBalance -= amount;
			}
		} else {
			System.out.println(String.format("Withdraw request Rejected, You should have minimum of %.1f Rs amount in you account",
					openingBalance));
			return;
		}
		
		displayBankInfo();

	}

	private boolean updateTotalBalance(double amount, boolean addAmount) {
		if (addAmount) {
			totalBalance += amount;
			return true;
		}
		if (amount > totalBalance) {
			System.out.println("Requested amount is greater than total amount balance available in bank");
			return false;
		}
		totalBalance -= amount;
		return true;
	}

	private void displayBankInfo() {
		getCurrentBalance();
		displayTotalBalance();
	}

	public void displayAccountInfo() {
		System.out.println("Account created with id " + accountId + " and name " + accountHolderName);
	}

	public double getCurrentBalance() {
		System.out.println("Current balance in " + accountHolderName + " account is " + currentBalance);
		return currentBalance;
	}

	public static void displayTotalBalance() {
		System.out.println("Total Balance in bank: " + totalBalance);
	}
}