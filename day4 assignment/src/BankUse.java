public class BankUse {

	public static int getRandomId() {
		int min = 100;
		int max = 999;
		return min + (int) (Math.random() * ((max - min) + 1));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount bank1 = new BankAccount(getRandomId(), "Kajal", AccountType.SAVING);
		BankAccount bank2 = new BankAccount(getRandomId(), "Shivam", AccountType.CURRENT);
		BankAccount bank3 = new BankAccount(getRandomId(), "Shubham", AccountType.SAVING);
//		bank1.displayAccountInfo();
		bank1.setOpeningBalance(300);
//		bank2.displayAccountInfo();
		bank2.setOpeningBalance(2000);
//		bank3.displayAccountInfo();
//		bank3.setOpeningBalance(500);
		bank1.withdrawAmount(300);
		bank2.withdrawAmount(1000);
//		bank3.withdrawAmount(400);
//		bank1.withdrawAmount(200);
//		bank2.withdrawAmount(350);
//		bank3.withdrawAmount(100);
	}

}
